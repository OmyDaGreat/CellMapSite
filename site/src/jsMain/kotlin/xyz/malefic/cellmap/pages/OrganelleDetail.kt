package xyz.malefic.cellmap.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.css.lineHeight
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.cellmap.models.CellOrganelleData

@Page("/organelle/{id}")
@Composable
fun OrganelleDetailPage() {
    val pageContext = rememberPageContext()
    val organelleId = pageContext.route.params["id"] ?: ""
    val organelle = CellOrganelleData.organelles.find { it.id == organelleId }

    Box(
        Modifier
            .fillMaxSize()
            .backgroundColor(Color("#F8F9FA"))
            .padding(32.px),
        contentAlignment = Alignment.TopCenter,
    ) {
        if (organelle != null) {
            Column(
                Modifier
                    .maxWidth(800.px)
                    .fillMaxWidth()
                    .backgroundColor(Colors.White)
                    .borderRadius(12.px)
                    .padding(40.px),
            ) {
                // Back link
                Link(
                    path = "/",
                    text = "← Back to Cell Explorer",
                )

                // Organelle image
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 32.px, top = 24.px),
                    contentAlignment = Alignment.Center,
                ) {
                    Img(
                        src = organelle.imageUrl,
                        alt = organelle.name,
                        attrs = {
                            style {
                                property("max-width", "400px")
                                property("width", "100%")
                                property("height", "auto")
                                property("border-radius", "12px")
                                property("box-shadow", "0 4px 12px rgba(0,0,0,0.1)")
                            }
                        },
                    )
                }

                // Organelle name as title
                H1(
                    attrs = {
                        style {
                            fontSize(36.px)
                            color(Color("#2C3E50"))
                            textAlign("center")
                            marginBottom(8.px)
                        }
                    },
                ) {
                    Text(organelle.name)
                }

                // Function subtitle
                H3(
                    attrs = {
                        style {
                            fontSize(18.px)
                            color(Color("#7F8C8D"))
                            textAlign("center")
                            marginBottom(32.px)
                            fontStyle("italic")
                        }
                    },
                ) {
                    Text(organelle.function)
                }

                // Full description
                P(
                    attrs = {
                        style {
                            fontSize(16.px)
                            color(Color("#2C3E50"))
                            lineHeight("1.6")
                            marginBottom(16.px)
                            property("white-space", "pre-line")
                        }
                    },
                ) {
                    Text(organelle.description)
                }

                // Color indicator
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 24.px),
                    contentAlignment = Alignment.Center,
                ) {
                    P(
                        attrs = {
                            style {
                                fontSize(14.px)
                                color(Color("#7F8C8D"))
                                textAlign("center")
                            }
                        },
                    ) {
                        Text("Organelle Color: ")
                        Div(
                            attrs = {
                                style {
                                    property("display", "inline-block")
                                    property("width", "20px")
                                    property("height", "20px")
                                    property("background-color", organelle.color)
                                    property("border-radius", "50%")
                                    property("margin-left", "8px")
                                    property("vertical-align", "middle")
                                }
                            },
                        )
                    }
                }
            }
        } else {
            // Error state - organelle not found
            Column(
                Modifier
                    .maxWidth(600.px)
                    .fillMaxWidth()
                    .backgroundColor(Colors.White)
                    .borderRadius(12.px)
                    .padding(40.px),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                H1(
                    attrs = {
                        style {
                            fontSize(32.px)
                            color(Color("#E74C3C"))
                            textAlign("center")
                            marginBottom(16.px)
                        }
                    },
                ) {
                    Text("Organelle Not Found")
                }

                P(
                    attrs = {
                        style {
                            fontSize(16.px)
                            color(Color("#7F8C8D"))
                            textAlign("center")
                            marginBottom(24.px)
                        }
                    },
                ) {
                    Text("The organelle with ID '$organelleId' could not be found.")
                }

                Link(
                    path = "/",
                    text = "← Back to Cell Explorer",
                )
            }
        }
    }
}
