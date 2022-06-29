// SPDX-License-Identifier: MIT
pragma solidity ^0.8.7;
//pragma experimental ABIEncoderV2;
import "./DateTimeLibrary.sol";

contract DockRequest{
    uint beginDate; // 1641207600 "timestamp is in seconds" = Segunda-feira, 3 de janeiro de 2022 08:00:00 GMT-03:00
	uint dueDate;   // 1672534800 "timestamp is in seconds" = Sábado, 31 de dezembro de 2022 22:00:00 GMT-03:00
    address process;
    address application;
    BerthingRequestForm[]  public berthingRequest;
    BerthingProposalForm[] berthingProposal;
    uint[] approvedProposalId;
    uint countBerthingRequest;
    uint countBerthingProposal;
    
    enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }   

    enum Status{
        REQUESTED_BY_PROCESS,
        EXPIRED_BY_APPLICATION,
        ACCEPTED_BY_APPLICATION,
        REJECT_BY_APPLICATION,
        EXPIRED_BY_PROCESS,      
        ACCEPTED_BY_PROCESS,                
        REJECT_BY_PROCESS,
        APPROVED_BY_APPLICATION       
    }

    struct BerthingRequestForm { 
        uint berthingRequestId;
        uint arriveDate;
        uint departureDate;
        string mmsi;
        string imo;
        string portServices;
        uint timestamp;
        Status status;
    }

    struct BerthingProposalForm{
        uint berthingRequestId;
        uint berthingProposalId;        
        uint arriveDate;
        uint departureDate;
        uint portCosts;        
        uint timestamp;
        Status status;     
    }

    constructor(address _process, address _application, uint _beginDate, uint _dueDate) {
        process = _process;
        application = _application;
        beginDate = _beginDate;
        dueDate = _dueDate;
        countBerthingRequest=0;
        countBerthingProposal=0;
    }

    function getStatus() public  pure returns (bool){   
            BerthingProposalForm[] memory proposalList;
            proposalList[0].push( BerthingProposalForm(0,1,2,3,4,5,Status.REJECT_BY_APPLICATION));
           return proposalList.status == Status.REJECT_BY_APPLICATION;
    }

    function responseWithProposal(uint _berthingRequestId, uint _arriveDate, uint _departureDate, uint _portCosts) public onlyBy(application){
            require(_berthingRequestId >= 0, "The _berthingRequestId parameter is missing");
            require(berthingProposal[_berthingRequestId].status == Status.REQUESTED_BY_PROCESS,"This request is processed already"); 
            //require((block.timestamp - berthingRequest[_berthingRequestId].timestamp) <3600,"This request is processed already");

            berthingProposal.push( BerthingProposalForm({ berthingRequestId:_berthingRequestId, 
                                                        berthingProposalId: countBerthingProposal++,
                                                        arriveDate: _arriveDate, 
                                                        departureDate:_departureDate, 
                                                        portCosts:_portCosts,
                                                        timestamp: block.timestamp,
                                                        status: Status.ACCEPTED_BY_APPLICATION}));            
    }
  
    // request operation performed by process/ 
    function request( uint _arriveDate, uint _departureDate, string memory  _mmsi,   string memory _imo) public onlyBy(process) {    
        require(!isSunday(block.timestamp),"It is not allow to send request on Sundays");
        require(_arriveDate >= block.timestamp && _departureDate > _arriveDate, "Invalid dates" );
        require(!isEmpty(_mmsi), "Missing data: MMSI " );
        require(!isEmpty(_imo), "Missing data: IMO " );
        
        berthingRequest.push( BerthingRequestForm({ berthingRequestId: countBerthingRequest++, 
                                                arriveDate: _arriveDate,
                                                departureDate: _departureDate,
                                                mmsi: _mmsi, 
                                                imo: _imo,
                                                portServices: "", 
                                                timestamp: block.timestamp, 
                                                status: Status.REQUESTED_BY_PROCESS }));
    }
       
    // ***************** Methods to read the Berthing requests **************************

    function getLastRequest() public view returns (BerthingRequestForm memory){
        uint last = berthingRequest.length - 1;
        return berthingRequest[last];       
    }

    function getSpecificRequest(uint id) public view returns (BerthingRequestForm memory){
       return berthingRequest[id];
    }
   
    function getAllRequest() public view returns (BerthingRequestForm[] memory){
        return berthingRequest;
    }

    // ------------------------ Methods to read the Berthing proposal ------------------------

    function getLastProposal() public view returns (BerthingProposalForm memory){
        uint last = berthingProposal.length - 1;
        return berthingProposal[last]; 
    }

    function getSpecificProposal(uint id) public view returns (BerthingProposalForm memory){
       return berthingProposal[id];
    }
   
    function getAllProposals() public view returns (BerthingProposalForm[] memory){
        return berthingProposal;
    }

    // *************************************************************************************
    
    //  ********************************** AUXILIAR METHODS ********************************
   
    modifier onlyBy(address party){
        if(party==process)
            require(msg.sender == party, "Only the integration process could perform this method!" );             
        else if(party==application)
            require(msg.sender == party, "Only the application could perform this method!");                      
        _; 
    }

    function isEmpty(string memory s1) public pure returns (bool) {
        return (keccak256(abi.encodePacked((s1))) == keccak256(abi.encodePacked((""))));
    }


  
    // -------------------- funções para manipular datas e horas (DateTimeLibrary)  --------------------------
    function timestampToDate(uint timestamp) public pure returns (uint year, uint month, uint day) {
        (year, month, day) = DateTimeLibrary.timestampToDate(timestamp);
    }

    function timestampFromDate(uint year, uint month, uint day) public pure returns (uint timestamp) {
        return DateTimeLibrary.timestampFromDate(year, month, day);
    }

    function getDayOfWeek(uint timestamp) public pure returns (uint dayOfWeek) {
        dayOfWeek = DateTimeLibrary.getDayOfWeek(timestamp);
    }

    function getHour(uint timestamp) public pure returns (uint hour) {
        hour = DateTimeLibrary.getHour(timestamp);
    }
    // -------------------- funções para manipular datas e horas (DateTimeLibrary)  --------------------------

    function isSunday(uint timestamp) public pure returns(bool){
        //monday=1... sunday=7.
        bool isIt = getDayOfWeek(timestamp) == 7;
        return isIt;
        
    }
}