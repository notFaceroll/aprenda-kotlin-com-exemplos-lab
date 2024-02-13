// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { INICIANTE, INTERMEDIARIO, ESPECIALISTA }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.INICIANTE)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", nivel = Nivel.INICIANTE)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", nivel = Nivel.INTERMEDIARIO)

    val formacao = Formacao("Curso de Kotlin", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Informações do curso de Kotlin:")
    println("Nome: ${formacao.nome}")
    println("Conteúdos:")
    formacao.conteudos.forEach { conteudo ->
        println(" - Nome: ${conteudo.nome}, Duração: ${conteudo.duracao} minutos, Nível: ${conteudo.nivel}")
    }
}
