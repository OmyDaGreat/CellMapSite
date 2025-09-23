package xyz.malefic.cellmap.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.borderRight
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.bottom
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.cursor
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.left
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.marginRight
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.opacity
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.top
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.cellmap.models.CellOrganelleData

@Page
@Composable
fun HomePage() {
    var selectedOrganelleId by remember { mutableStateOf<String?>(null) }

    Box(
        Modifier
            .fillMaxSize()
            .backgroundColor(Colors.White),
    ) {
        Row(Modifier.fillMaxSize()) {
            // Left panel - Property listings (Sotheby's style)
            Box(
                Modifier
                    .width(40.percent)
                    .height(100.vh)
                    .padding(24.px)
                    .backgroundColor(Color("#FAFAFA"))
                    .borderRight(1.px, LineStyle.Solid, Color("#E0E0E0")),
            ) {
                Column {
                    H1(
                        attrs = {
                            style {
                                fontSize(28.px)
                                color(Color("#2C3E50"))
                                marginBottom(8.px)
                            }
                        },
                    ) {
                        Text("Cell Organelles")
                    }

                    P(
                        attrs = {
                            style {
                                fontSize(16.px)
                                color(Color("#7F8C8D"))
                                marginBottom(24.px)
                            }
                        },
                    ) {
                        Text("Explore the fascinating structures within a eukaryotic cell")
                    }

                    // Organelle cards
                    CellOrganelleData.organelles.forEach { organelle ->
                        val isSelected = selectedOrganelleId == organelle.id
                        Div(
                            attrs = {
                                onClick { selectedOrganelleId = organelle.id }
                                style {
                                    width(100.percent)
                                    backgroundColor(if (isSelected) Color("#F8F9FA") else Colors.White)
                                    borderRadius(12.px)
                                    padding(20.px)
                                    marginBottom(16.px)
                                    border(
                                        1.px,
                                        LineStyle.Solid,
                                        if (isSelected) Color("#007BFF") else Color("#E8E8E8"),
                                    )
                                    cursor("pointer")
                                }
                            },
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Div(
                                    attrs = {
                                        style {
                                            width(12.px)
                                            height(12.px)
                                            borderRadius(50.percent)
                                            backgroundColor(Color(organelle.color))
                                            marginRight(8.px)
                                        }
                                    },
                                )
                                H2(
                                    attrs = {
                                        style {
                                            fontSize(18.px)
                                            color(Color("#2C3E50"))
                                            margin(0.px)
                                        }
                                    },
                                ) {
                                    Text(organelle.name)
                                }
                            }

                            P(
                                attrs = {
                                    style {
                                        fontSize(14.px)
                                        color(Color("#7F8C8D"))
                                        fontStyle("italic")
                                        marginBottom(12.px)
                                        marginTop(8.px)
                                    }
                                },
                            ) {
                                Text(organelle.function)
                            }

                            P(
                                attrs = {
                                    style {
                                        fontSize(14.px)
                                        color(Color("#555555"))
                                        marginBottom(12.px)
                                    }
                                },
                            ) {
                                Text(
                                    if (organelle.description.length > 120) {
                                        organelle.description.take(120) + "..."
                                    } else {
                                        organelle.description
                                    },
                                )
                            }

                            Div(
                                attrs = {
                                    style {
                                        display(DisplayStyle.InlineBlock)
                                        padding(4.px, 8.px)
                                        borderRadius(12.px)
                                        fontSize(12.px)
                                        color(Colors.White)
                                        backgroundColor(Color(organelle.color))
                                    }
                                },
                            ) {
                                Text("Essential Organelle")
                            }
                        }
                    }
                }
            }

            // Right panel - Cell map
            Box(
                Modifier
                    .width(60.percent)
                    .height(100.vh)
                    .padding(32.px)
                    .backgroundColor(Color("#F8F9FA"))
                    .display(DisplayStyle.Flex)
                    .alignItems(AlignItems.Center)
                    .justifyContent(JustifyContent.Center),
            ) {
                // Cell container
                Box(
                    Modifier
                        .width(600.px)
                        .height(600.px)
                        .position(Position.Relative)
                        .backgroundColor(Color("#E8F4FD"))
                        .borderRadius(50.percent)
                        .border(3.px, LineStyle.Solid, Color("#2C5F2D")),
                ) {
                    // Cell membrane outline
                    Div(
                        attrs = {
                            style {
                                position(Position.Absolute)
                                width(95.percent)
                                height(95.percent)
                                top(2.5.percent)
                                left(2.5.percent)
                                border(2.px, LineStyle.Dashed, Color("#2C5F2D"))
                                borderRadius(50.percent)
                                opacity(0.3)
                            }
                        },
                    )

                    // Organelle points
                    CellOrganelleData.organelles.forEach { organelle ->
                        val isSelected = selectedOrganelleId == organelle.id
                        Div(
                            attrs = {
                                onClick { selectedOrganelleId = organelle.id }
                                style {
                                    position(Position.Absolute)
                                    left(organelle.mapPosition.x.percent)
                                    top(organelle.mapPosition.y.percent)
                                    width(organelle.size.width.px)
                                    height(organelle.size.height.px)
                                    borderRadius(50.percent)
                                    backgroundColor(Color(organelle.color))
                                    cursor("pointer")
                                    if (isSelected) {
                                        border(3.px, LineStyle.Solid, Color("#FFD700"))
                                    } else {
                                        border(2.px, LineStyle.Solid, Colors.White)
                                    }
                                }
                            },
                            content = {
                                // Tooltip on selection
                                if (isSelected) {
                                    Div(
                                        attrs = {
                                            style {
                                                position(Position.Absolute)
                                                bottom(100.percent)
                                                left(50.percent)
                                                marginLeft((-50).px)
                                                backgroundColor(Color("rgba(0,0,0,0.9)"))
                                                color(Colors.White)
                                                padding(8.px, 12.px)
                                                borderRadius(6.px)
                                                fontSize(14.px)
                                                marginBottom(8.px)
                                                property("white-space", "nowrap")
                                            }
                                        },
                                    ) {
                                        Text(organelle.name)
                                    }
                                }
                            },
                        )
                    }
                }
            }
        }
    }
}
