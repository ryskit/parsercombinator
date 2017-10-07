package jp.ed.nnn.parsercombinator

/**
  * @author ryskit 
  */
object BooleanParser extends MyFirstCombinator {

  def trueParser: Parser[Boolean] = map(s("true"), { _: String => true })
  def falseParser: Parser[Boolean] = map(s("false"), { _: String => false })

  def apply(input: String): ParseResult[Boolean] =
    select(trueParser, falseParser)(input)
}
