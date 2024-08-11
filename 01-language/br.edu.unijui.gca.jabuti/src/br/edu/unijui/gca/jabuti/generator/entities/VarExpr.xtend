package br.edu.unijui.gca.jabuti.generator.entities


import java.util.ArrayList

class VarExpr extends StructVar {
    ArrayList<String> content

    // Construtor que chama o construtor da superclasse
    new(String name, String type, ArrayList<String> content) {
        super(name, type)       
        this.content = new ArrayList<String>
        this.content.addAll(content)
    }

    // Getter e Setter para content
    def ArrayList<String> getContent() {
        return content
    }

    def void setContent(String content) {
        this.content = content
    }

    // Método para concatenar conteúdo
    def void concatContent(String content) {
        this.content = this.content + content
    }

    // Override do método toString
    override toString() {
        "VarExpr [Name: " + this.getName() + ", Type: " + this.getType() + ", Content: " + this.content + "]"
    }
}