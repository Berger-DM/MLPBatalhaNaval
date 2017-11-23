import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.BorderLayout


class FrontEnd {
    FrontEnd() {
        def builder = new SwingBuilder()
        builder.edt {
            frame(title: 'Battleship', size: [500, 350], show: true, locationRelativeTo: null, resizable: false, 
                  defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE) {
                borderLayout(vgap: 5)

                panel(constraints: BorderLayout.CENTER) {
                    tableLayout {
                        tr {
                            td {
                                label '  '
                            }
                            td {
                                label ' A'
                            }
                            td {
                                label ' B'
                            }
                            td {
                                label ' C'
                            }
                            td {
                                label ' D'
                            }
                            td {
                                label ' E'
                            }
                            td {
                                label ' F'
                            }
                            td {
                                label ' G'
                            }
                            td {
                                label ' H'
                            }
                            td {
                                label ' I'
                            }
                            td {
                                label ' J'
                            }
                        }
                        tr {
                            td {
                                label '1'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '2'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '3'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '4'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '5'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '6'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '7'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '8'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '9'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                        tr {
                            td {
                                label '10'
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                            td {
                                button(text: ' ')
                            }
                        }
                    }
                }
            }

        }
    }
}
