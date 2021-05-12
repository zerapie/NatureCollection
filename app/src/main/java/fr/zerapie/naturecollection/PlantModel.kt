package fr.zerapie.naturecollection

class PlantModel(
        val id: String= "plant0",
        val name: String = "Tulipe",
        val description : String = "petit desription",
        val imageUrl: String = "http://graven.yt/plante.jpg",
        val grow: String = "Faible",
        val water: String = "Moyenne",
        var liked: Boolean = false
)