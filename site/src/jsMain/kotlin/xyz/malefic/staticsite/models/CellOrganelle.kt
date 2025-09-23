package xyz.malefic.staticsite.models

data class CellOrganelle(
    val id: String,
    val name: String,
    val description: String,
    val function: String,
    val imageUrl: String,
    val mapPosition: Position,
    val size: Size,
    val color: String
)

data class Position(
    val x: Double,
    val y: Double
)

data class Size(
    val width: Double,
    val height: Double
)

// Sample cell organelle data
object CellOrganelleData {
    val organelles = listOf(
        CellOrganelle(
            id = "nucleus",
            name = "Nucleus",
            description = "The nucleus is the control center of the cell, containing most of the cell's genetic material in the form of DNA. It regulates gene expression and mediates the replication of DNA during the cell cycle.",
            function = "Controls cell activities and contains DNA",
            imageUrl = "/images/nucleus.jpg",
            mapPosition = Position(50.0, 35.0),
            size = Size(15.0, 15.0),
            color = "#8B4513"
        ),
        CellOrganelle(
            id = "mitochondria",
            name = "Mitochondria",
            description = "Known as the powerhouses of the cell, mitochondria are responsible for generating most of the cell's supply of adenosine triphosphate (ATP), used as a source of chemical energy.",
            function = "Produces energy (ATP) for the cell",
            imageUrl = "/images/mitochondria.jpg",
            mapPosition = Position(25.0, 60.0),
            size = Size(12.0, 8.0),
            color = "#FF6B6B"
        ),
        CellOrganelle(
            id = "ribosome",
            name = "Ribosome",
            description = "Ribosomes are the protein factories of the cell. They translate messenger RNA (mRNA) into proteins by assembling amino acids in the correct sequence.",
            function = "Protein synthesis",
            imageUrl = "/images/ribosome.jpg",
            mapPosition = Position(70.0, 45.0),
            size = Size(6.0, 6.0),
            color = "#4ECDC4"
        ),
        CellOrganelle(
            id = "endoplasmic_reticulum",
            name = "Endoplasmic Reticulum",
            description = "The ER is a network of membranes that extends throughout the cytoplasm. Rough ER is studded with ribosomes and involved in protein synthesis, while smooth ER synthesizes lipids.",
            function = "Protein and lipid synthesis, transport",
            imageUrl = "/images/er.jpg",
            mapPosition = Position(60.0, 25.0),
            size = Size(20.0, 10.0),
            color = "#45B7D1"
        ),
        CellOrganelle(
            id = "golgi_apparatus",
            name = "Golgi Apparatus",
            description = "The Golgi apparatus modifies, packages, and ships proteins and lipids received from the endoplasmic reticulum. It acts like a post office for the cell.",
            function = "Modifies and packages proteins",
            imageUrl = "/images/golgi.jpg",
            mapPosition = Position(75.0, 70.0),
            size = Size(10.0, 12.0),
            color = "#96CEB4"
        ),
        CellOrganelle(
            id = "lysosome",
            name = "Lysosome",
            description = "Lysosomes are membrane-bound organelles that contain digestive enzymes. They break down waste materials, cellular debris, and foreign substances that enter the cell.",
            function = "Digests waste and worn-out cell parts",
            imageUrl = "/images/lysosome.jpg",
            mapPosition = Position(30.0, 25.0),
            size = Size(8.0, 8.0),
            color = "#FFEAA7"
        )
    )
}