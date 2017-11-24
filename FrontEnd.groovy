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
                                a1 = button text:' ', actionPerformed: {a1.setText("."); a1.setEnabled(false)}
                            }
                            td {
                                b1 = button text:' ', actionPerformed: {b1.setText("."); b1.setEnabled(false)}
                            }
                            td {
                                c1 = button text:' ', actionPerformed: {c1.setText("."); c1.setEnabled(false)}
                            }
                            td {
                                d1 = button text:' ', actionPerformed: {d1.setText("."); d1.setEnabled(false)}
                            }
                            td {
                                e1 = button text:' ', actionPerformed: {e1.setText("."); e1.setEnabled(false)}
                            }
                            td {
                                f1 = button text:' ', actionPerformed: {f1.setText("."); f1.setEnabled(false)}
                            }
                            td {
                                g1 = button text:' ', actionPerformed: {g1.setText("."); g1.setEnabled(false)}
                            }
                            td {
                                h1 = button text:' ', actionPerformed: {h1.setText("."); h1.setEnabled(false)}
                            }
                            td {
                                i1 = button text:' ', actionPerformed: {i1.setText("."); i1.setEnabled(false)}
                            }
                            td {
                                j1 = button text:' ', actionPerformed: {j1.setText("."); j1.setEnabled(false)}
                            }
                        } // Terminar de configurar por essa linha e então copiar para as demais.
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
