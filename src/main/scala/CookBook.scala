import java.io.{File, PrintWriter}
import scala.io.Source
import scala.collection.mutable.ArrayBuffer

object CookBook extends App {

  val real_path = "./src/resource/cookbook.txt"
  val bufferedSource = Source.fromFile(real_path)
  val lines = bufferedSource.getLines.toArray
  bufferedSource.close
  //lines.foreach(println)

  def getRecipeName(lines: Array[String], startLine: Int, endLine: Int): Array[String] = {
    val inLine = lines.slice(startLine, endLine)
    val recipeName = inLine.filter(line => line.toUpperCase == line || line.startsWith("""   """))
    recipeName
  }
  val recipeName = getRecipeName(lines, 1061, 3250)
  recipeName.foreach(println)

val text = recipeName.mkString("\n")
  val relative_save_path = "./src/resource/cookbook_cleaned.txt"
  import java.io.{File, PrintWriter}
  val pw = new PrintWriter(new File(relative_save_path))
  pw write(text)
  CookBook.this.pw.close()





 // def getAllIngredients(lines: Array[String], recipeName: Array[String]): Map[String, Array[String]] = {
  //  val recipeNameMap = recipeName.map(recipe => (recipe, ArrayBuffer[String]())).toMap
  //  var mainRecipe = ""
  //  for(line <- lines){
   //   if(recipeName.contains(line)) {
   //     mainRecipe = line
     // } else if (line.length > 2 && line(line.length-2).isDigit && line.startsWith("   ") && mainRecipe != ""){
   //     println(mainRecipe)
   //     recipeNameMap(mainRecipe) += line
    //  }
   // }
    //val result = for((recipeName, ingred) <- recipeNameMap) yield (recipeName, ingred.toArray)
    //result
    //val ingredients = lines.filter(line => line.startsWith("""    """))
    //ingredients
  //}
//val book = getAllIngredients(lines, recipeName)
  //println(book)
  //val ingredients = getget(lines)
  //ingredients.foreach(println)

   // for(line <- lines) {
    //if (recipeName == line) println(line)
    //else if (ingredients == line) println(line) else line.trim.length == 0
//}
  //println(lines)
}
