import io.github.ayfri.kore.commands.say
import io.github.ayfri.kore.dataPack
import io.github.ayfri.kore.functions.function
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

const val outputPathFolder = "./out"

fun main() {
	val myDatapack = dataPack("my_datapack") {
		path = Path(outputPathFolder).createDirectories()

		function("my_function") {
			say("Hello Minecraft world !")
		}
	}

	myDatapack.generateZip()
}
