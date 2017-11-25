import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.BorderLayout
import java.awt.Dimension


class FrontEnd {
    FrontEnd() {
        int torpedos = 50
        def builder = new SwingBuilder()
        builder.edt {
            frame(title: 'Battleship', size: [600, 400], show: true, locationRelativeTo: null, resizable: false,
                    defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE) {

                borderLayout(vgap: 5)
                count = label text: 'Torpedos: 50', constraints: BorderLayout.NORTH

                panel(constraints: BorderLayout.CENTER) {
                    tableLayout {
                        tr {
                            td {
                                lblSpc = label text: ' '
                            }
                            td {
                                labelA = label text: 'A'
                            }
                            td {
                                labelB = label text: 'B'
                            }
                            td {
                                labelC = label text: 'C'
                            }
                            td {
                                labelD = label text: 'D'
                            }
                            td {
                                labelE = label text: 'E'
                            }
                            td {
                                labelF = label text: 'F'
                            }
                            td {
                                labelG = label text: 'G'
                            }
                            td {
                                labelH = label text: 'H'
                            }
                            td {
                                labelI = label text: 'I'
                            }
                            td {
                                labelJ = label text: 'J'
                            }
                        }
                        tr {
                            td {
                                label text: '1'
                            }
                            td {
                                a1 = button text:'  ',
                                        actionPerformed: {showPos(a1, 0, 0, BackEnd.board)
                                            a1.setEnabled(false); torpedos--}
                                a1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b1 = button text:'  ',
                                        actionPerformed: {showPos(b1, 0, 1, BackEnd.board)
                                            b1.setEnabled(false); torpedos--}
                                b1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c1 = button text:'  ',
                                        actionPerformed: {showPos(c1, 0, 2, BackEnd.board)
                                            c1.setEnabled(false); torpedos--}
                                c1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d1 = button text:'  ',
                                        actionPerformed: {showPos(d1, 0, 3, BackEnd.board)
                                            d1.setEnabled(false); torpedos--}
                                d1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e1 = button text:'  ',
                                        actionPerformed: {showPos(e1, 0, 4, BackEnd.board)
                                            e1.setEnabled(false); torpedos--}
                                e1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f1 = button text:'  ',
                                        actionPerformed: {showPos(f1, 0, 5, BackEnd.board)
                                            f1.setEnabled(false); torpedos--}
                                f1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g1 = button text:'  ',
                                        actionPerformed: {showPos(g1, 0, 6, BackEnd.board)
                                            g1.setEnabled(false); torpedos--}
                                g1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h1 = button text:'  ',
                                        actionPerformed: {showPos(h1, 0, 7, BackEnd.board)
                                            h1.setEnabled(false); torpedos--}
                                h1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i1 = button text:'  ',
                                        actionPerformed: {showPos(i1, 0, 8, BackEnd.board)
                                            i1.setEnabled(false); torpedos--}
                                i1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j1 = button text:'  ',
                                        actionPerformed: {showPos(j1, 0, 9, BackEnd.board)
                                            j1.setEnabled(false); torpedos--}
                                j1.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '2'
                            }
                            td {
                                a2 = button text:'  ',
                                        actionPerformed: {showPos(a2, 1, 0, BackEnd.board)
                                            a2.setEnabled(false); torpedos--}
                                a2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b2 = button text:'  ',
                                        actionPerformed: {showPos(b2, 1, 1, BackEnd.board)
                                            b2.setEnabled(false); torpedos--}
                                b2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c2 = button text:'  ',
                                        actionPerformed: {showPos(c2, 1, 2, BackEnd.board)
                                            c2.setEnabled(false); torpedos--}
                                c2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d2 = button text:'  ',
                                        actionPerformed: {showPos(d2, 1, 3, BackEnd.board)
                                            d2.setEnabled(false); torpedos--}
                                d2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e2 = button text:'  ',
                                        actionPerformed: {showPos(e2, 1, 4, BackEnd.board)
                                            e2.setEnabled(false); torpedos--}
                                e2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f2 = button text:'  ',
                                        actionPerformed: {showPos(f2, 1, 5, BackEnd.board)
                                            f2.setEnabled(false); torpedos--}
                                f2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g2 = button text:'  ',
                                        actionPerformed: {showPos(g2, 1, 6, BackEnd.board)
                                            g2.setEnabled(false); torpedos--}
                                g2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h2 = button text:'  ',
                                        actionPerformed: {showPos(h2, 1, 7, BackEnd.board)
                                            h2.setEnabled(false); torpedos--}
                                h2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i2 = button text:'  ',
                                        actionPerformed: {showPos(i2, 1, 8, BackEnd.board)
                                            i2.setEnabled(false); torpedos--}
                                i2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j2 = button text:'  ',
                                        actionPerformed: {showPos(j2, 1, 9, BackEnd.board)
                                            j2.setEnabled(false); torpedos--}
                                j2.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '3'
                            }
                            td {
                                a3 = button text:'  ',
                                        actionPerformed: {showPos(a3, 2, 0, BackEnd.board)
                                            a3.setEnabled(false); torpedos--}
                                a3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b3 = button text:'  ',
                                        actionPerformed: {showPos(b3, 2, 1, BackEnd.board)
                                            b3.setEnabled(false); torpedos--}
                                b3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c3 = button text:'  ',
                                        actionPerformed: {showPos(c3, 2, 2, BackEnd.board)
                                            c3.setEnabled(false); torpedos--}
                                c3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d3 = button text:'  ',
                                        actionPerformed: {showPos(d3, 2, 3, BackEnd.board)
                                            d3.setEnabled(false); torpedos--}
                                d3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e3 = button text:'  ',
                                        actionPerformed: {showPos(e3, 2, 4, BackEnd.board)
                                            e3.setEnabled(false); torpedos--}
                                e3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f3 = button text:'  ',
                                        actionPerformed: {showPos(f3, 2, 5, BackEnd.board)
                                            f3.setEnabled(false); torpedos--}
                                f3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g3 = button text:'  ',
                                        actionPerformed: {showPos(g3, 2, 6, BackEnd.board)
                                            g3.setEnabled(false); torpedos--}
                                g3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h3 = button text:'  ',
                                        actionPerformed: {showPos(h3, 2, 7, BackEnd.board)
                                            h3.setEnabled(false); torpedos--}
                                h3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i3 = button text:'  ',
                                        actionPerformed: {showPos(i3, 2, 8, BackEnd.board)
                                            i3.setEnabled(false); torpedos--}
                                i3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j3 = button text:'  ',
                                        actionPerformed: {showPos(j3, 2, 9, BackEnd.board)
                                            j3.setEnabled(false); torpedos--}
                                j3.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '4'
                            }
                            td {
                                a4 = button text:' ',
                                        actionPerformed: {showPos(a4, 3, 0, BackEnd.board)
                                            a4.setEnabled(false)}
                                a4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b4 = button text:' ',
                                        actionPerformed: {showPos(b4, 3, 1, BackEnd.board)
                                            b4.setEnabled(false)}
                                b4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c4 = button text:' ',
                                        actionPerformed: {showPos(c4, 3, 2, BackEnd.board)
                                            c4.setEnabled(false)}
                                c4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d4 = button text:' ',
                                        actionPerformed: {showPos(d4, 3, 3, BackEnd.board)
                                            d4.setEnabled(false)}
                                d4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e4 = button text:' ',
                                        actionPerformed: {showPos(e4, 3, 4, BackEnd.board)
                                            e4.setEnabled(false)}
                                e4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f4 = button text:' ',
                                        actionPerformed: {showPos(f4, 3, 5, BackEnd.board)
                                            f4.setEnabled(false)}
                                f4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g4 = button text:' ',
                                        actionPerformed: {showPos(g4, 3, 6, BackEnd.board)
                                            g4.setEnabled(false)}
                                g4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h4 = button text:' ',
                                        actionPerformed: {showPos(h4, 3, 7, BackEnd.board)
                                            h4.setEnabled(false)}
                                h4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i4 = button text:' ',
                                        actionPerformed: {showPos(i4, 3, 8, BackEnd.board)
                                            i4.setEnabled(false)}
                                i4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j4 = button text:' ',
                                        actionPerformed: {showPos(j4, 3, 9, BackEnd.board)
                                            j4.setEnabled(false)}
                                j4.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '5'
                            }
                            td {
                                a5 = button text:' ',
                                        actionPerformed: {showPos(a5, 4, 0, BackEnd.board)
                                            a5.setEnabled(false)}
                                a5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b5 = button text:' ',
                                        actionPerformed: {showPos(b5, 4, 1, BackEnd.board)
                                            b5.setEnabled(false)}
                                b5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c5 = button text:' ',
                                        actionPerformed: {showPos(c5, 4, 2, BackEnd.board)
                                            c5.setEnabled(false)}
                                c5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d5 = button text:' ',
                                        actionPerformed: {showPos(d5, 4, 3, BackEnd.board)
                                            d5.setEnabled(false)}
                                d5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e5 = button text:' ',
                                        actionPerformed: {showPos(e5, 4, 4, BackEnd.board)
                                            e5.setEnabled(false)}
                                e5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f5 = button text:' ',
                                        actionPerformed: {showPos(f5, 4, 5, BackEnd.board)
                                            f5.setEnabled(false)}
                                f5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g5 = button text:' ',
                                        actionPerformed: {showPos(g5, 4, 6, BackEnd.board)
                                            g5.setEnabled(false)}
                                g5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h5 = button text:' ',
                                        actionPerformed: {showPos(h5, 4, 7, BackEnd.board)
                                            h5.setEnabled(false)}
                                h5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i5 = button text:' ',
                                        actionPerformed: {showPos(i5, 4, 8, BackEnd.board)
                                            i5.setEnabled(false)}
                                i5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j5 = button text:' ',
                                        actionPerformed: {showPos(j5, 4, 9, BackEnd.board)
                                            j5.setEnabled(false)}
                                j5.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '6'
                            }
                            td {
                                a6 = button text:' ',
                                        actionPerformed: {showPos(a6, 5, 0, BackEnd.board)
                                            a6.setEnabled(false); torpedos--}
                                a6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b6 = button text:' ',
                                        actionPerformed: {showPos(b6, 5, 1, BackEnd.board)
                                            b6.setEnabled(false); torpedos--}
                                b6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c6 = button text:' ',
                                        actionPerformed: {showPos(c6, 5, 2, BackEnd.board)
                                            c6.setEnabled(false); torpedos--}
                                c6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d6 = button text:' ',
                                        actionPerformed: {showPos(d6, 5, 3, BackEnd.board)
                                            d6.setEnabled(false); torpedos--}
                                d6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e6 = button text:' ',
                                        actionPerformed: {showPos(e6, 5, 4, BackEnd.board)
                                            e6.setEnabled(false); torpedos--}
                                e6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f6 = button text:' ',
                                        actionPerformed: {showPos(f6, 5, 5, BackEnd.board)
                                            f6.setEnabled(false); torpedos--}
                                f6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g6 = button text:' ',
                                        actionPerformed: {showPos(g6, 5, 6, BackEnd.board)
                                            g6.setEnabled(false); torpedos--}
                                g6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h6 = button text:' ',
                                        actionPerformed: {showPos(h6, 5, 7, BackEnd.board)
                                            h6.setEnabled(false); torpedos--}
                                h6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i6 = button text:' ',
                                        actionPerformed: {showPos(i6, 5, 8, BackEnd.board)
                                            i6.setEnabled(false); torpedos--}
                                i6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j6 = button text:' ',
                                        actionPerformed: {showPos(j6, 5, 9, BackEnd.board)
                                            j6.setEnabled(false); torpedos--}
                                j6.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '7'
                            }
                            td {
                                a7 = button text:' ',
                                        actionPerformed: {showPos(a7, 6, 0, BackEnd.board)
                                            a7.setEnabled(false); torpedos--}
                                a7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b7 = button text:' ',
                                        actionPerformed: {showPos(b7, 6, 1, BackEnd.board)
                                            b7.setEnabled(false); torpedos--}
                                b7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c7 = button text:' ',
                                        actionPerformed: {showPos(c7, 6, 2, BackEnd.board)
                                            c7.setEnabled(false); torpedos--}
                                c7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d7 = button text:' ',
                                        actionPerformed: {showPos(d7, 6, 3, BackEnd.board)
                                            d7.setEnabled(false); torpedos--}
                                d7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e7 = button text:' ',
                                        actionPerformed: {showPos(e7, 6, 4, BackEnd.board)
                                            e7.setEnabled(false); torpedos--}
                                e7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f7 = button text:' ',
                                        actionPerformed: {showPos(f7, 6, 5, BackEnd.board)
                                            f7.setEnabled(false); torpedos--}
                                f7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g7 = button text:' ',
                                        actionPerformed: {showPos(g7, 6, 6, BackEnd.board)
                                            g7.setEnabled(false); torpedos--}
                                g7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h7 = button text:' ',
                                        actionPerformed: {showPos(h7, 6, 7, BackEnd.board)
                                            h7.setEnabled(false); torpedos--}
                                h7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i7 = button text:' ',
                                        actionPerformed: {showPos(i7, 6, 8, BackEnd.board)
                                            i7.setEnabled(false); torpedos--}
                                i7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j7 = button text:' ',
                                        actionPerformed: {showPos(j7, 6, 9, BackEnd.board)
                                            j7.setEnabled(false); torpedos--}
                                j7.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '8'
                            }
                            td {
                                a8 = button text:' ',
                                        actionPerformed: {showPos(a8, 7, 0, BackEnd.board)
                                            a8.setEnabled(false)}
                                a8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b8 = button text:' ',
                                        actionPerformed: {showPos(b8, 7, 1, BackEnd.board)
                                            b8.setEnabled(false)}
                                b8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c8 = button text:' ',
                                        actionPerformed: {showPos(c8, 7, 2, BackEnd.board)
                                            c8.setEnabled(false)}
                                c8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d8 = button text:' ',
                                        actionPerformed: {showPos(d8, 7, 3, BackEnd.board)
                                            d8.setEnabled(false)}
                                d8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e8 = button text:' ',
                                        actionPerformed: {showPos(e8, 7, 4, BackEnd.board)
                                            e8.setEnabled(false)}
                                e8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f8 = button text:' ',
                                        actionPerformed: {showPos(f8, 7, 5, BackEnd.board)
                                            f8.setEnabled(false)}
                                f8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g8 = button text:' ',
                                        actionPerformed: {showPos(g8, 7, 6, BackEnd.board)
                                            g8.setEnabled(false)}
                                g8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h8 = button text:' ',
                                        actionPerformed: {showPos(h8, 7, 7, BackEnd.board)
                                            h8.setEnabled(false)}
                                h8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i8 = button text:' ',
                                        actionPerformed: {showPos(i8, 7, 8, BackEnd.board)
                                            i8.setEnabled(false)}
                                i8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j8 = button text:' ',
                                        actionPerformed: {showPos(j8, 7, 9, BackEnd.board)
                                            j8.setEnabled(false)}
                                j8.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '9'
                            }
                            td {
                                a9 = button text:' ',
                                        actionPerformed: {showPos(a9, 8, 0, BackEnd.board)
                                            a9.setEnabled(false); torpedos--}
                                a9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b9 = button text:' ',
                                        actionPerformed: {showPos(b9, 8, 1, BackEnd.board)
                                            b9.setEnabled(false); torpedos--}
                                b9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c9 = button text:' ',
                                        actionPerformed: {showPos(c9, 8, 2, BackEnd.board)
                                            c9.setEnabled(false); torpedos--}
                                c9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d9 = button text:' ',
                                        actionPerformed: {showPos(d9, 8, 3, BackEnd.board)
                                            d9.setEnabled(false); torpedos--}
                                d9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e9 = button text:' ',
                                        actionPerformed: {showPos(e9, 8, 4, BackEnd.board)
                                            e9.setEnabled(false); torpedos--}
                                e9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f9 = button text:' ',
                                        actionPerformed: {showPos(f9, 8, 5, BackEnd.board)
                                            f9.setEnabled(false); torpedos--}
                                f9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g9 = button text:' ',
                                        actionPerformed: {showPos(g9, 8, 6, BackEnd.board)
                                            g9.setEnabled(false); torpedos--}
                                g9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h9 = button text:' ',
                                        actionPerformed: {showPos(h9, 8, 7, BackEnd.board)
                                            h9.setEnabled(false); torpedos--}
                                h9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i9 = button text:' ',
                                        actionPerformed: {showPos(i9, 8, 8, BackEnd.board)
                                            i9.setEnabled(false); torpedos--}
                                i9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j9 = button text:' ',
                                        actionPerformed: {showPos(j9, 8, 9, BackEnd.board)
                                            j9.setEnabled(false); torpedos--}
                                j9.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '10'
                            }
                            td {
                                a10 = button text:' ',
                                        actionPerformed: {showPos(a10, 9, 0, BackEnd.board)
                                            a10.setEnabled(false); torpedos--}
                                a10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b10 = button text:' ',
                                        actionPerformed: {showPos(b10, 9, 1, BackEnd.board)
                                            b10.setEnabled(false); torpedos--}
                                b10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c10 = button text:' ',
                                        actionPerformed: {showPos(c10, 9, 2, BackEnd.board)
                                            c10.setEnabled(false); torpedos--}
                                c10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d10 = button text:' ',
                                        actionPerformed: {showPos(d10, 9, 3, BackEnd.board)
                                            d10.setEnabled(false); torpedos--}
                                d10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e10 = button text:' ',
                                        actionPerformed: {showPos(e10, 9, 4, BackEnd.board)
                                            e10.setEnabled(false); torpedos--}
                                e10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f10 = button text:' ',
                                        actionPerformed: {showPos(f10, 9, 5, BackEnd.board)
                                            f10.setEnabled(false); torpedos--}
                                f10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g10 = button text:' ',
                                        actionPerformed: {showPos(g10, 9, 6, BackEnd.board)
                                            g10.setEnabled(false); torpedos--}
                                g10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h10 = button text:' ',
                                        actionPerformed: {showPos(h10, 9, 7, BackEnd.board)
                                            h10.setEnabled(false); torpedos--}
                                h10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i10 = button text:' ',
                                        actionPerformed: {showPos(i10, 9, 8, BackEnd.board)
                                            i10.setEnabled(false); torpedos--}
                                i10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j10 = button text:' ',
                                        actionPerformed: {showPos(j10, 9, 9, BackEnd.board)
                                            j10.setEnabled(false); torpedos--}
                                j10.setPreferredSize(new Dimension(50,30))
                            }
                        }
                    }
                }
            }

        }
        builder.optionPane().showMessageDialog(null, 'Regras do jogo:' + '\n'
                + 'Você tem 50 Torpedos para destruir a frota inimiga.' + '\n'
                + 'Se não a destruir neste tempo, o contra-ataque do inimigo' + '\n'
                + 'irá destruir sua frota. Boa sorte.')
    }

    static void showPos (JButton b, int row, int col, ArrayList<Integer> board) {
        int pos = (board[row][col] as Integer)
        switch (pos) {
            case 1:
                b.setText('S') // S for Submarine
                break
            case 2:
                b.setText('D') // D for Destroyer
                break
            case 3:
                b.setText('C') // C for Cruiser
                break
            case 4:
                b.setText('B') // B for Battleship
                break
            default:
                b.setText('W') // W for Water
                break
        }
    }
}

