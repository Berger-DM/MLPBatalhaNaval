import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.BorderLayout


class FrontEnd {
    FrontEnd() {
        def builder = new SwingBuilder()
        builder.edt {
            frame(title: 'Battleship', size: [550, 350], show: true, locationRelativeTo: null, resizable: false,
                    defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE) {

                borderLayout(vgap: 5)

                panel(constraints: BorderLayout.CENTER) {
                    tableLayout {
                        tr {
                            td {
                                lblSpc = button text: '  '
                                lblSpc.setEnabled(false)
                            }
                            td {
                                labelA = button text: 'A'
                                labelA.setEnabled(false)
                            }
                            td {
                                labelB = button text: 'B'
                                labelB.setEnabled(false)
                            }
                            td {
                                labelC = button text: 'C'
                                labelC.setEnabled(false)
                            }
                            td {
                                labelD = button text: 'D'
                                labelD.setEnabled(false)
                            }
                            td {
                                labelE = button text: 'E'
                                labelE.setEnabled(false)
                            }
                            td {
                                labelF = button text: 'F'
                                labelF.setEnabled(false)
                            }
                            td {
                                labelG = button text: 'G'
                                labelG.setEnabled(false)
                            }
                            td {
                                labelH = button text: 'H'
                                labelH.setEnabled(false)
                            }
                            td {
                                labelI = button text: 'I'
                                labelI.setEnabled(false)
                            }
                            td {
                                labelJ = button text: 'J'
                                labelJ.setEnabled(false)
                            }
                        }
                        tr {
                            td {
                                label text: '1'
                            }
                            td {
                                a1 = button text:'  ', actionPerformed: {showPos(a1, 0, 0, BackEnd.board); a1.setEnabled(false)}
                            }
                            td {
                                b1 = button text:'  ', actionPerformed: {showPos(b1, 0, 1, BackEnd.board); b1.setEnabled(false)}
                            }
                            td {
                                c1 = button text:'  ', actionPerformed: {showPos(c1, 0, 0, BackEnd.board); c1.setEnabled(false)}
                            }
                            td {
                                d1 = button text:'  ', actionPerformed: {showPos(d1, 0, 0, BackEnd.board); d1.setEnabled(false)}
                            }
                            td {
                                e1 = button text:'  ', actionPerformed: {showPos(e1, 0, 0, BackEnd.board); e1.setEnabled(false)}
                            }
                            td {
                                f1 = button text:'  ', actionPerformed: {showPos(f1, 0, 0, BackEnd.board); f1.setEnabled(false)}
                            }
                            td {
                                g1 = button text:'  ', actionPerformed: {showPos(g1, 0, 0, BackEnd.board); g1.setEnabled(false)}
                            }
                            td {
                                h1 = button text:'  ', actionPerformed: {showPos(h1, 0, 0, BackEnd.board); h1.setEnabled(false)}
                            }
                            td {
                                i1 = button text:'  ', actionPerformed: {showPos(i1, 0, 0, BackEnd.board); i1.setEnabled(false)}
                            }
                            td {
                                j1 = button text:'  ', actionPerformed: {showPos(j1, 0, 0, BackEnd.board); j1.setEnabled(false)}
                            }
                        } // Terminar de configurar por essa linha e então copiar para as demais.
                        tr {
                            td {
                                label '2'
                            }
                            td {
                                a2 = button text:' ', actionPerformed: {showPos(a2, 0, 0, BackEnd.board); a2.setEnabled(false)}
                            }
                            td {
                                b2 = button text:' ', actionPerformed: {showPos(b2, 0, 1, BackEnd.board); b2.setEnabled(false)}
                            }
                            td {
                                c2 = button text:' ', actionPerformed: {showPos(c2, 0, 0, BackEnd.board); c2.setEnabled(false)}
                            }
                            td {
                                d2 = button text:' ', actionPerformed: {showPos(d2, 0, 0, BackEnd.board); d2.setEnabled(false)}
                            }
                            td {
                                e2 = button text:' ', actionPerformed: {showPos(e2, 0, 0, BackEnd.board); e2.setEnabled(false)}
                            }
                            td {
                                f2 = button text:' ', actionPerformed: {showPos(f2, 0, 0, BackEnd.board); f2.setEnabled(false)}
                            }
                            td {
                                g2 = button text:' ', actionPerformed: {showPos(g2, 0, 0, BackEnd.board); g2.setEnabled(false)}
                            }
                            td {
                                h2 = button text:' ', actionPerformed: {showPos(h2, 0, 0, BackEnd.board); h2.setEnabled(false)}
                            }
                            td {
                                i2 = button text:' ', actionPerformed: {showPos(i2, 0, 0, BackEnd.board); i2.setEnabled(false)}
                            }
                            td {
                                j2 = button text:' ', actionPerformed: {showPos(j2, 0, 0, BackEnd.board); j2.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '3'
                            }
                            td {
                                a3 = button text:' ', actionPerformed: {showPos(a3, 0, 0, BackEnd.board); a3.setEnabled(false)}
                            }
                            td {
                                b3 = button text:' ', actionPerformed: {showPos(b3, 0, 1, BackEnd.board); b3.setEnabled(false)}
                            }
                            td {
                                c3 = button text:' ', actionPerformed: {showPos(c3, 0, 0, BackEnd.board); c3.setEnabled(false)}
                            }
                            td {
                                d3 = button text:' ', actionPerformed: {showPos(d3, 0, 0, BackEnd.board); d3.setEnabled(false)}
                            }
                            td {
                                e3 = button text:' ', actionPerformed: {showPos(e3, 0, 0, BackEnd.board); e3.setEnabled(false)}
                            }
                            td {
                                f3 = button text:' ', actionPerformed: {showPos(f3, 0, 0, BackEnd.board); f3.setEnabled(false)}
                            }
                            td {
                                g3 = button text:' ', actionPerformed: {showPos(g3, 0, 0, BackEnd.board); g3.setEnabled(false)}
                            }
                            td {
                                h3 = button text:' ', actionPerformed: {showPos(h3, 0, 0, BackEnd.board); h3.setEnabled(false)}
                            }
                            td {
                                i3 = button text:' ', actionPerformed: {showPos(i3, 0, 0, BackEnd.board); i3.setEnabled(false)}
                            }
                            td {
                                j3 = button text:' ', actionPerformed: {showPos(j3, 0, 0, BackEnd.board); j3.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '4'
                            }
                            td {
                                a4 = button text:' ', actionPerformed: {showPos(a4, 0, 0, BackEnd.board); a4.setEnabled(false)}
                            }
                            td {
                                b4 = button text:' ', actionPerformed: {showPos(b4, 0, 1, BackEnd.board); b4.setEnabled(false)}
                            }
                            td {
                                c4 = button text:' ', actionPerformed: {showPos(c4, 0, 0, BackEnd.board); c4.setEnabled(false)}
                            }
                            td {
                                d4 = button text:' ', actionPerformed: {showPos(d4, 0, 0, BackEnd.board); d4.setEnabled(false)}
                            }
                            td {
                                e4 = button text:' ', actionPerformed: {showPos(e4, 0, 0, BackEnd.board); e4.setEnabled(false)}
                            }
                            td {
                                f4 = button text:' ', actionPerformed: {showPos(f4, 0, 0, BackEnd.board); f4.setEnabled(false)}
                            }
                            td {
                                g4 = button text:' ', actionPerformed: {showPos(g4, 0, 0, BackEnd.board); g4.setEnabled(false)}
                            }
                            td {
                                h4 = button text:' ', actionPerformed: {showPos(h4, 0, 0, BackEnd.board); h4.setEnabled(false)}
                            }
                            td {
                                i4 = button text:' ', actionPerformed: {showPos(i4, 0, 0, BackEnd.board); i4.setEnabled(false)}
                            }
                            td {
                                j4 = button text:' ', actionPerformed: {showPos(j4, 0, 0, BackEnd.board); j4.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '5'
                            }
                            td {
                                a5 = button text:' ', actionPerformed: {showPos(a5, 0, 0, BackEnd.board); a5.setEnabled(false)}
                            }
                            td {
                                b5 = button text:' ', actionPerformed: {showPos(b5, 0, 1, BackEnd.board); b5.setEnabled(false)}
                            }
                            td {
                                c5 = button text:' ', actionPerformed: {showPos(c5, 0, 0, BackEnd.board); c5.setEnabled(false)}
                            }
                            td {
                                d5 = button text:' ', actionPerformed: {showPos(d5, 0, 0, BackEnd.board); d5.setEnabled(false)}
                            }
                            td {
                                e5 = button text:' ', actionPerformed: {showPos(e5, 0, 0, BackEnd.board); e5.setEnabled(false)}
                            }
                            td {
                                f5 = button text:' ', actionPerformed: {showPos(f5, 0, 0, BackEnd.board); f5.setEnabled(false)}
                            }
                            td {
                                g5 = button text:' ', actionPerformed: {showPos(g5, 0, 0, BackEnd.board); g5.setEnabled(false)}
                            }
                            td {
                                h5 = button text:' ', actionPerformed: {showPos(h5, 0, 0, BackEnd.board); h5.setEnabled(false)}
                            }
                            td {
                                i5 = button text:' ', actionPerformed: {showPos(i5, 0, 0, BackEnd.board); i5.setEnabled(false)}
                            }
                            td {
                                j5 = button text:' ', actionPerformed: {showPos(j5, 0, 0, BackEnd.board); j5.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '6'
                            }
                            td {
                                a6 = button text:' ', actionPerformed: {showPos(a6, 0, 0, BackEnd.board); a6.setEnabled(false)}
                            }
                            td {
                                b6 = button text:' ', actionPerformed: {showPos(b6, 0, 1, BackEnd.board); b6.setEnabled(false)}
                            }
                            td {
                                c6 = button text:' ', actionPerformed: {showPos(c6, 0, 0, BackEnd.board); c6.setEnabled(false)}
                            }
                            td {
                                d6 = button text:' ', actionPerformed: {showPos(d6, 0, 0, BackEnd.board); d6.setEnabled(false)}
                            }
                            td {
                                e6 = button text:' ', actionPerformed: {showPos(e6, 0, 0, BackEnd.board); e6.setEnabled(false)}
                            }
                            td {
                                f6 = button text:' ', actionPerformed: {showPos(f6, 0, 0, BackEnd.board); f6.setEnabled(false)}
                            }
                            td {
                                g6 = button text:' ', actionPerformed: {showPos(g6, 0, 0, BackEnd.board); g6.setEnabled(false)}
                            }
                            td {
                                h6 = button text:' ', actionPerformed: {showPos(h6, 0, 0, BackEnd.board); h6.setEnabled(false)}
                            }
                            td {
                                i6 = button text:' ', actionPerformed: {showPos(i6, 0, 0, BackEnd.board); i6.setEnabled(false)}
                            }
                            td {
                                j6 = button text:' ', actionPerformed: {showPos(j6, 0, 0, BackEnd.board); j6.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '7'
                            }
                            td {
                                a7 = button text:' ', actionPerformed: {showPos(a7, 0, 0, BackEnd.board); a7.setEnabled(false)}
                            }
                            td {
                                b7 = button text:' ', actionPerformed: {showPos(b7, 0, 1, BackEnd.board); b7.setEnabled(false)}
                            }
                            td {
                                c7 = button text:' ', actionPerformed: {showPos(c7, 0, 0, BackEnd.board); c7.setEnabled(false)}
                            }
                            td {
                                d7 = button text:' ', actionPerformed: {showPos(d7, 0, 0, BackEnd.board); d7.setEnabled(false)}
                            }
                            td {
                                e7 = button text:' ', actionPerformed: {showPos(e7, 0, 0, BackEnd.board); e7.setEnabled(false)}
                            }
                            td {
                                f7 = button text:' ', actionPerformed: {showPos(f7, 0, 0, BackEnd.board); f7.setEnabled(false)}
                            }
                            td {
                                g7 = button text:' ', actionPerformed: {showPos(g7, 0, 0, BackEnd.board); g7.setEnabled(false)}
                            }
                            td {
                                h7 = button text:' ', actionPerformed: {showPos(h7, 0, 0, BackEnd.board); h7.setEnabled(false)}
                            }
                            td {
                                i7 = button text:' ', actionPerformed: {showPos(i7, 0, 0, BackEnd.board); i7.setEnabled(false)}
                            }
                            td {
                                j7 = button text:' ', actionPerformed: {showPos(j7, 0, 0, BackEnd.board); j7.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '8'
                            }
                            td {
                                a8 = button text:' ', actionPerformed: {showPos(a8, 0, 0, BackEnd.board); a8.setEnabled(false)}
                            }
                            td {
                                b8 = button text:' ', actionPerformed: {showPos(b8, 0, 1, BackEnd.board); b8.setEnabled(false)}
                            }
                            td {
                                c8 = button text:' ', actionPerformed: {showPos(c8, 0, 0, BackEnd.board); c8.setEnabled(false)}
                            }
                            td {
                                d8 = button text:' ', actionPerformed: {showPos(d8, 0, 0, BackEnd.board); d8.setEnabled(false)}
                            }
                            td {
                                e8 = button text:' ', actionPerformed: {showPos(e8, 0, 0, BackEnd.board); e8.setEnabled(false)}
                            }
                            td {
                                f8 = button text:' ', actionPerformed: {showPos(f8, 0, 0, BackEnd.board); f8.setEnabled(false)}
                            }
                            td {
                                g8 = button text:' ', actionPerformed: {showPos(g8, 0, 0, BackEnd.board); g8.setEnabled(false)}
                            }
                            td {
                                h8 = button text:' ', actionPerformed: {showPos(h8, 0, 0, BackEnd.board); h8.setEnabled(false)}
                            }
                            td {
                                i8 = button text:' ', actionPerformed: {showPos(i8, 0, 0, BackEnd.board); i8.setEnabled(false)}
                            }
                            td {
                                j8 = button text:' ', actionPerformed: {showPos(j8, 0, 0, BackEnd.board); j8.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '9'
                            }
                            td {
                                a9 = button text:' ', actionPerformed: {showPos(a9, 0, 0, BackEnd.board); a9.setEnabled(false)}
                            }
                            td {
                                b9 = button text:' ', actionPerformed: {showPos(b9, 0, 1, BackEnd.board); b9.setEnabled(false)}
                            }
                            td {
                                c9 = button text:' ', actionPerformed: {showPos(c9, 0, 0, BackEnd.board); c9.setEnabled(false)}
                            }
                            td {
                                d9 = button text:' ', actionPerformed: {showPos(d9, 0, 0, BackEnd.board); d9.setEnabled(false)}
                            }
                            td {
                                e9 = button text:' ', actionPerformed: {showPos(e9, 0, 0, BackEnd.board); e9.setEnabled(false)}
                            }
                            td {
                                f9 = button text:' ', actionPerformed: {showPos(f9, 0, 0, BackEnd.board); f9.setEnabled(false)}
                            }
                            td {
                                g9 = button text:' ', actionPerformed: {showPos(g9, 0, 0, BackEnd.board); g9.setEnabled(false)}
                            }
                            td {
                                h9 = button text:' ', actionPerformed: {showPos(h9, 0, 0, BackEnd.board); h9.setEnabled(false)}
                            }
                            td {
                                i9 = button text:' ', actionPerformed: {showPos(i9, 0, 0, BackEnd.board); i9.setEnabled(false)}
                            }
                            td {
                                j9 = button text:' ', actionPerformed: {showPos(j9, 0, 0, BackEnd.board); j9.setEnabled(false)}
                            }
                        }
                        tr {
                            td {
                                label '10'
                            }
                            td {
                                a10 = button text:' ', actionPerformed: {showPos(a10, 0, 0, BackEnd.board); a10.setEnabled(false)}
                            }
                            td {
                                b10 = button text:' ', actionPerformed: {showPos(b10, 0, 1, BackEnd.board); b10.setEnabled(false)}
                            }
                            td {
                                c10 = button text:' ', actionPerformed: {showPos(c10, 0, 0, BackEnd.board); c10.setEnabled(false)}
                            }
                            td {
                                d10 = button text:' ', actionPerformed: {showPos(d10, 0, 0, BackEnd.board); d10.setEnabled(false)}
                            }
                            td {
                                e10 = button text:' ', actionPerformed: {showPos(e10, 0, 0, BackEnd.board); e10.setEnabled(false)}
                            }
                            td {
                                f10 = button text:' ', actionPerformed: {showPos(f10, 0, 0, BackEnd.board); f10.setEnabled(false)}
                            }
                            td {
                                g10 = button text:' ', actionPerformed: {showPos(g10, 0, 0, BackEnd.board); g10.setEnabled(false)}
                            }
                            td {
                                h10 = button text:' ', actionPerformed: {showPos(h10, 0, 0, BackEnd.board); h10.setEnabled(false)}
                            }
                            td {
                                i10 = button text:' ', actionPerformed: {showPos(i10, 0, 0, BackEnd.board); i10.setEnabled(false)}
                            }
                            td {
                                j10 = button text:' ', actionPerformed: {showPos(j10, 0, 0, BackEnd.board); j10.setEnabled(false)}
                            }
                        }
                    }
                }
            }

        }
    }

    static void showPos (JButton b, int row, int col, ArrayList<Integer> board) {
        if (board[row][col] == 1) {
            println('yay')
        }
        else {
            println('nay')
        }
    }
}
