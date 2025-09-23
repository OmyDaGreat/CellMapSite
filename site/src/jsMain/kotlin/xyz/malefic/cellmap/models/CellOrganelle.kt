package xyz.malefic.cellmap.models

data class CellOrganelle(
    val id: String,
    val name: String,
    val description: String,
    val function: String,
    val imageUrl: String,
    val mapPosition: Position,
    val size: Size,
    val color: String,
)

data class Position(
    val x: Double,
    val y: Double,
)

data class Size(
    val width: Double,
    val height: Double,
)

// Sample cell organelle data
object CellOrganelleData {
    val organelles =
        listOf(
            CellOrganelle(
                id = "nucleus",
                name = "DNA Studio: The Design Center of the Cell",
                description =
                    "“Located within the bustling information hub of the cell, this studio is where everything important happens!”\n" +
                        "\n" +
                        "Containing the genetic material of the cell, the nucleus is a premier design studio where all of the power and decision-making rests. Surrounded by high double-membrane walls, the flow of information in and out of the cell is guarded by nuclear pores. At the very core of the nucleus, you can’t miss the area that is the nucleolus; this is where the important ribosomal RNA is synthesized, combining to assemble the cozy and beautifully diverse ribosome apartments you see at the border.\n" +
                        "\n" +
                        "Around this central chamber of the studio, you’ll find the ultimate chromatin library for all of your needs and projects. This is where you’ll find the DNA blueprints, helping to draft instructions for any situation you can possibly encounter. You’ll be directly involved within the process of creating mRNA, sending them out to create important proteins.\n" +
                        "\n" +
                        "Coming fully furnished with all the materials you need for innovation, choose the nucleus if you’re an inspired creative who wants to make an impact!",
                function = "Controls cell activities and contains DNA",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419900264583794688/image.png?ex=68d370ab&is=68d21f2b&hm=40f8444e6636b1625e09e4e8d370090ec85c95c18abf5cac6c31ddef78100fb6&=&format=webp&quality=lossless",
                mapPosition = Position(45.0, 40.0),
                size = Size(80.0, 80.0),
                color = "#8B4513",
            ),
            CellOrganelle(
                id = "mitochondria",
                name = "The Mighty Mitochondria",
                description =
                    "Welcome to the Mighty Mitochondria, the cell's favorite power plant! This bean shaped home may look simple on the outside, but on the inside, it is a non-stop energy factory!\n" +
                        "\n" +
                        "The mitochondria works around the clock to turn the food you eat into fuel for everything you do. Think of it as your own personal battery that never runs out. So, you’ll also never experience a blackout!\n" +
                        "\n" +
                        "Key Features:\n" +
                        "Power Production: Makes energy (ATP) for the whole cell.\n" +
                        "Double Wall Security: A safe and secure environment.\n" +
                        "Always Working: Never stops producing power. No blackouts.\n" +
                        "\n" +
                        "Perfect For: Anyone who needs energy to live, work, and play!",
                function = "Produces energy (ATP) for the cell",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419889405480403004/screenshot-2025-09-22_20-31-24.png?ex=68d3668e&is=68d2150e&hm=b556f6aa9ae5cfef3a41a166fd4b247790c643baa27d7421fc4d5a7fc4a78cca&=&format=webp&quality=lossless",
                mapPosition = Position(15.0, 55.0),
                size = Size(60.0, 40.0),
                color = "#FF6B6B",
            ),
            CellOrganelle(
                id = "chloroplast",
                name = "The Chloroplast: The Sunlight Snack House",
                description =
                    "“The House That Eats Sunshine!”\n" +
                        "\n" +
                        "This house soaks up sunlight with its green walls.\n" +
                        "\n" +
                        "It turns sunlight into food! Inside, the chloroplast mixes sun, air, and water to make sugar for energy. It also makes fresh, clean air for everyone.\n" +
                        "It’s like having a built in private Chef and solar panels all in one!\n" +
                        "\n" +
                        "How it works:\n" +
                        "Sunlight enters through the green walls (because of chlorophyll).\n" +
                        "Inside the kitchen (the stroma), sunlight, water, and air mix together.\n" +
                        "The home produces yummy sugars (glucose) for energy and releases fresh oxygen into the house.\n" +
                        "\n" +
                        "Best Features:\n" +
                        "Sun powered kitchen makes its own food from light.\n" +
                        "Fills the air with clean oxygen, eco friendly.\n" +
                        "Always sunny and green inside.\n" +
                        "\n" +
                        "Perfect for: \n" +
                        "Anyone who loves sunny days and snacks!\n",
                function = "Photosynthesis and energy production",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419895884350488616/image.png?ex=68d36c97&is=68d21b17&hm=06ae93ae22b269112d9d63c9c46dba71fa7885f6b6f5b66320139b5e50f1b9f2&=&format=webp&quality=lossless",
                mapPosition = Position(75.0, 75.0),
                size = Size(50.0, 50.0),
                color = "#32CD32",
            ),
            CellOrganelle(
                id = "ribosome",
                name = "Ribosomes: Humble & Essential Homes",
                description =
                    "The ribosomes may be small, but they are perfect, cozy homes to meet the needs of those who don’t want much. On the outside, they may not seem stunning, but they are extremely significant and respected because they synthesize proteins—and proteins are critical for basically all cellular functions.\n" +
                        "\n" +
                        "We have two location offers. One is right next to the rough endoplasmic reticulum. Ribosomes here translate mRNA, which has exited the nucleus, into a polypeptide chain that will become a protein to be inserted into the cell membrane, or secreted. Choose this location if you would like to be near the hustle and bustle and center of cell town, the nucleus. Our second offered location is in the cytosol. These free ribosomes translate the mRNA into a polypeptide chain that will become a protein (usually an enzyme) meant to function in the cytosol. Choose this location if you would like more privacy and space to yourself.\n" +
                        "\n" +
                        "Whatever option you decide, know we have millions of ribosome apartments available for your selection!",
                function = "Protein synthesis",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419899678702571550/image.png?ex=68d3701f&is=68d21e9f&hm=26f12399c1030be6709c80fa8d0ce95b1c2d0cd8e92a2530ecab6bb0fbe95309&=&format=webp&quality=lossless",
                mapPosition = Position(65.0, 35.0),
                size = Size(45.0, 45.0),
                color = "#4ECDC4",
            ),
            CellOrganelle(
                id = "endoplasmic_reticulum",
                name = "The ER: Convenient & Spacious Living",
                description =
                    "The Endoplasmic Reticulum is the modern home you’re looking for! With its structure of many curvy cisternae, you will never run out of space. Not only that, but you are right next to the center of cell town—the nucleus. Additionally, you can easily catch a ride on public transport as the ER is important for its intracellular transport. It helps synthesize lipids and proteins and sends them off in transport vesicles.\n" +
                        "\n" +
                        "This property comes in two parts (a double deal!). First, the rough ER. It has a stylish look through the decorative ribosomes that are attached to it. These allow for the compartmentalization of protein synthesis—mRNA that exits the nucleus is translated by ribosomes. Next, the smooth ER. While it has a more simplistic look with no ribosomes, it synthesizes lipids like phospholipids, cholesterol, and steroids. This includes fats used for insulation, meaning this home comes with its own heating! Also, the smooth ER has enzymes that detoxify the cell. Who wouldn’t want a self-cleaning house?",
                function = "Protein and lipid synthesis, transport",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419897828494413884/image.png?ex=68d36e66&is=68d21ce6&hm=023669bbae352476199f46df2d329ea57148da5f03d2b599fee856da3a225b1a&=&format=webp&quality=lossless",
                mapPosition = Position(25.0, 20.0),
                size = Size(70.0, 50.0),
                color = "#45B7D1",
            ),
            CellOrganelle(
                id = "golgi_apparatus",
                name = "Cisternae Court: For Refining & the Refined",
                description =
                    "“If luxury and prestige were a place, this sprawling estate would be it.”\n" +
                        "\n" +
                        "As you step in through the cis face, you’ll find that proteins and elegance are the only things packaged into the membranous sacs (cisternae) which make up the Golgi apparatus. Far from serving as just your average home, the Golgi complex is where polished treasures are created every second, as raw, unrefined cellular products (like proteins) are correctly folded and chemically modified. You’ll be able to watch their value skyrocket in real time! \n" +
                        "\n" +
                        "This estate is best for those who can appreciate order, as they’ll be witness to the sorting, tagging, and packaging of these cellular products in different wings of the estate. For our culinary experts, you can have a snack and watch the creation of glycoproteins in our sugar orchards. \n" +
                        "\n" +
                        "Cisternae Court is situated in a wonderful community of couriers, whom you can socialize daily at the estate’s trans face as they pick up materials to send out into the cytosol.",
                function = "Modifies and packages proteins",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419900416640028682/image.png?ex=68d370cf&is=68d21f4f&hm=2a2453b71cdde50efa2dfaa15153b7f669c73e68b51096349cbf8d79dff04c92&=&format=webp&quality=lossless",
                mapPosition = Position(75.0, 50.0),
                size = Size(60.0, 45.0),
                color = "#96CEB4",
            ),
            CellOrganelle(
                id = "central_vacuole",
                name = "Vacuole Villa: The Heart of the Plant Cell",
                description =
                    "“The only pressure you will be under is monetary and turgor! Only for those who like to live large and in charge!”\n" +
                        "\n" +
                        "As the storage space in the heart of the cell, we offer uninhibited access to the finest substances, including water and nutrients. Not only are we abundant, but our storage of these materials is also organized—guaranteeing you the cleanest of amenities. Choose this location for the best quality of metabolism and growth, as we offer convenient access to premium ion, sugar, and protein stores! \n" +
                        "\n" +
                        "No renovations are needed, as structural integrity, security, and beauty is the name of the game.\n" +
                        "Through our turgor pressure, we keep the walls firm and upright easily so you can sleep safe, sound, and spacious! \n" +
                        "We’ve also got a state-of-the-art security system in toxic compounds and enzymes that help deter herbivores and pathogens. \n" +
                        "The interior comes fully furnished with gorgeous anthocyanin pigments, adding bright and fun colors to your living space!",
                function = "Storage, waste disposal, growth",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419900122052956200/image.png?ex=68d37089&is=68d21f09&hm=3488103cd8ddffecd7e05878930e2e07b013cf239d0e92c3f058bd2135aa337b&=&format=webp&quality=lossless",
                mapPosition = Position(30.0, 70.0),
                size = Size(55.0, 60.0),
                color = "#FFB6B9",
            ),
            CellOrganelle(
                id = "plasma_membrane",
                name = "Gatekeeper Grove: The Glamorous Gateway to the Cell",
                description =
                    "“It feels like a party every day—hey, Jessie!”\n" +
                        "\n" +
                        "If you’re an extrovert, welcome to the flashiest area in the whole cell. In the plasma membrane, you’ll meet a plethora of unique materials that seek to leave and enter the cell. Only the most esteemed and eminent will swing by, as our high-tech hydrophobic fatty acids serve as the best security system in the cell through its selective permeability. Stay in this area if you want to see the noteworthy, nonpolar molecules—or go to our proteins to meet the ions cruising in through private lanes and active transport.\n" +
                        "\n" +
                        "You’ll find that the mosaic model construction is to die for; it isn’t just stunning, it’s crucial to the stability of the plasma membrane. Weak hydrophobic interactions allow the membrane to move and shift, maintaining fluid and structural integrity at different temperatures. This location is embellished by membrane carbohydrates—integral and flashy markers for the cell.",
                function = "Regulates entry and exit of substances",
                imageUrl = "https://media.discordapp.net/attachments/1039369834149990471/1419900587138351184/image.png?ex=68d370f8&is=68d21f78&hm=bd72fca4d0a63942624987c19dba816c9c61f14677fad82bc5eb20d802198bf0&=&format=webp&quality=lossless",
                mapPosition = Position(10.0, 25.0),
                size = Size(65.0, 40.0),
                color = "#F7D794",
            ),
        )
}
