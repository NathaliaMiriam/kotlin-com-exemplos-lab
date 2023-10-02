// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }

    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("Usuário ${usuario.nome} desmatriculado da formação $nome.")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 150)

    val formacao = Formacao("Formação de Programador", listOf(conteudo1, conteudo2, conteudo3))

    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")
    val usuario3 = Usuario("Carlos")

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    formacao.desmatricular(usuario2)
}
