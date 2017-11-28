import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension


class FrontEnd {
    private board

    FrontEnd() {
        def builder = new SwingBuilder()



        builder.edt {
            frame(title: 'Battleship', size: [800, 530], show: true, locationRelativeTo: null, resizable: false,
                    defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE) {

                borderLayout(vgap: 5)

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
                            td {
                                labelJ = label text: 'K'
                            }
                            td {
                                labelJ = label text: 'L'
                            }
                            td {
                                labelJ = label text: 'M'
                            }
                            td {
                                labelJ = label text: 'N'
                            }
                            td {
                                labelJ = label text: 'O'
                            }
                        }
                        tr {
                            td {
                                label text: '1'
                            }
                            td {
                                a1 = button text:'  ',
                                        actionPerformed: {showPos(a1, 0, 0, Board.board)
                                            a1.setEnabled(false)}
                                a1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b1 = button text:'  ',
                                        actionPerformed: {showPos(b1, 0, 1, Board.board)
                                            b1.setEnabled(false)}
                                b1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c1 = button text:'  ',
                                        actionPerformed: {showPos(c1, 0, 2, Board.board)
                                            c1.setEnabled(false)}
                                c1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d1 = button text:'  ',
                                        actionPerformed: {showPos(d1, 0, 3, Board.board)
                                            d1.setEnabled(false)}
                                d1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e1 = button text:'  ',
                                        actionPerformed: {showPos(e1, 0, 4, Board.board)
                                            e1.setEnabled(false)}
                                e1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f1 = button text:'  ',
                                        actionPerformed: {showPos(f1, 0, 5, Board.board)
                                            f1.setEnabled(false)}
                                f1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g1 = button text:'  ',
                                        actionPerformed: {showPos(g1, 0, 6, Board.board)
                                            g1.setEnabled(false)}
                                g1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h1 = button text:'  ',
                                        actionPerformed: {showPos(h1, 0, 7, Board.board)
                                            h1.setEnabled(false)}
                                h1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i1 = button text:'  ',
                                        actionPerformed: {showPos(i1, 0, 8, Board.board)
                                            i1.setEnabled(false)}
                                i1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j1 = button text:'  ',
                                        actionPerformed: {showPos(j1, 0, 9, Board.board)
                                            j1.setEnabled(false)}
                                j1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k1 = button text:'  ',
                                        actionPerformed: {showPos(k1, 0, 10, Board.board)
                                            k1.setEnabled(false)}
                                k1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l1 = button text:'  ',
                                        actionPerformed: {showPos(l1, 0, 11, Board.board)
                                            l1.setEnabled(false)}
                                l1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m1 = button text:'  ',
                                        actionPerformed: {showPos(m1, 0, 12, Board.board)
                                            m1.setEnabled(false)}
                                m1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n1 = button text:'  ',
                                        actionPerformed: {showPos(n1, 0, 13, Board.board)
                                            n1.setEnabled(false)}
                                n1.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o1 = button text:'  ',
                                        actionPerformed: {showPos(o1, 0, 14, Board.board)
                                            o1.setEnabled(false)}
                                o1.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '2'
                            }
                            td {
                                a2 = button text:'  ',
                                        actionPerformed: {showPos(a2, 1, 0, Board.board)
                                            a2.setEnabled(false)}
                                a2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b2 = button text:'  ',
                                        actionPerformed: {showPos(b2, 1, 1, Board.board)
                                            b2.setEnabled(false)}
                                b2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c2 = button text:'  ',
                                        actionPerformed: {showPos(c2, 1, 2, Board.board)
                                            c2.setEnabled(false)}
                                c2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d2 = button text:'  ',
                                        actionPerformed: {showPos(d2, 1, 3, Board.board)
                                            d2.setEnabled(false)}
                                d2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e2 = button text:'  ',
                                        actionPerformed: {showPos(e2, 1, 4, Board.board)
                                            e2.setEnabled(false)}
                                e2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f2 = button text:'  ',
                                        actionPerformed: {showPos(f2, 1, 5, Board.board)
                                            f2.setEnabled(false)}
                                f2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g2 = button text:'  ',
                                        actionPerformed: {showPos(g2, 1, 6, Board.board)
                                            g2.setEnabled(false)}
                                g2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h2 = button text:'  ',
                                        actionPerformed: {showPos(h2, 1, 7, Board.board)
                                            h2.setEnabled(false)}
                                h2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i2 = button text:'  ',
                                        actionPerformed: {showPos(i2, 1, 8, Board.board)
                                            i2.setEnabled(false)}
                                i2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j2 = button text:'  ',
                                        actionPerformed: {showPos(j2, 1, 9, Board.board)
                                            j2.setEnabled(false)}
                                j2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k2 = button text:'  ',
                                        actionPerformed: {showPos(k2, 1, 10, Board.board)
                                            k2.setEnabled(false)}
                                k2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l2 = button text:'  ',
                                        actionPerformed: {showPos(l2, 1, 11, Board.board)
                                            l2.setEnabled(false)}
                                l2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m2 = button text:'  ',
                                        actionPerformed: {showPos(m2, 1, 12, Board.board)
                                            m2.setEnabled(false)}
                                m2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n2 = button text:'  ',
                                        actionPerformed: {showPos(n2, 1, 13, Board.board)
                                            n2.setEnabled(false)}
                                n2.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o2 = button text:'  ',
                                        actionPerformed: {showPos(o2, 1, 14, Board.board)
                                            o2.setEnabled(false)}
                                o2.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '3'
                            }
                            td {
                                a3 = button text:'  ',
                                        actionPerformed: {showPos(a3, 2, 0, Board.board)
                                            a3.setEnabled(false)}
                                a3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b3 = button text:'  ',
                                        actionPerformed: {showPos(b3, 2, 1, Board.board)
                                            b3.setEnabled(false)}
                                b3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c3 = button text:'  ',
                                        actionPerformed: {showPos(c3, 2, 2, Board.board)
                                            c3.setEnabled(false)}
                                c3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d3 = button text:'  ',
                                        actionPerformed: {showPos(d3, 2, 3, Board.board)
                                            d3.setEnabled(false)}
                                d3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e3 = button text:'  ',
                                        actionPerformed: {showPos(e3, 2, 4, Board.board)
                                            e3.setEnabled(false)}
                                e3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f3 = button text:'  ',
                                        actionPerformed: {showPos(f3, 2, 5, Board.board)
                                            f3.setEnabled(false)}
                                f3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g3 = button text:'  ',
                                        actionPerformed: {showPos(g3, 2, 6, Board.board)
                                            g3.setEnabled(false)}
                                g3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h3 = button text:'  ',
                                        actionPerformed: {showPos(h3, 2, 7, Board.board)
                                            h3.setEnabled(false)}
                                h3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i3 = button text:'  ',
                                        actionPerformed: {showPos(i3, 2, 8, Board.board)
                                            i3.setEnabled(false)}
                                i3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j3 = button text:'  ',
                                        actionPerformed: {showPos(j3, 2, 9, Board.board)
                                            j3.setEnabled(false)}
                                j3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k3 = button text:'  ',
                                        actionPerformed: {showPos(k3, 2, 10, Board.board)
                                            k3.setEnabled(false)}
                                k3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l3 = button text:'  ',
                                        actionPerformed: {showPos(l3, 2, 11, Board.board)
                                            l3.setEnabled(false)}
                                l3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m3 = button text:'  ',
                                        actionPerformed: {showPos(m3, 2, 12, Board.board)
                                            m3.setEnabled(false)}
                                m3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n3 = button text:'  ',
                                        actionPerformed: {showPos(n3, 2, 13, Board.board)
                                            n3.setEnabled(false)}
                                n3.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o3 = button text:'  ',
                                        actionPerformed: {showPos(o3, 2, 14, Board.board)
                                            o3.setEnabled(false)}
                                o3.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '4'
                            }
                            td {
                                a4 = button text:' ',
                                        actionPerformed: {showPos(a4, 3, 0, Board.board)
                                            a4.setEnabled(false)}
                                a4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b4 = button text:' ',
                                        actionPerformed: {showPos(b4, 3, 1, Board.board)
                                            b4.setEnabled(false)}
                                b4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c4 = button text:' ',
                                        actionPerformed: {showPos(c4, 3, 2, Board.board)
                                            c4.setEnabled(false)}
                                c4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d4 = button text:' ',
                                        actionPerformed: {showPos(d4, 3, 3, Board.board)
                                            d4.setEnabled(false)}
                                d4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e4 = button text:' ',
                                        actionPerformed: {showPos(e4, 3, 4, Board.board)
                                            e4.setEnabled(false)}
                                e4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f4 = button text:' ',
                                        actionPerformed: {showPos(f4, 3, 5, Board.board)
                                            f4.setEnabled(false)}
                                f4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g4 = button text:' ',
                                        actionPerformed: {showPos(g4, 3, 6, Board.board)
                                            g4.setEnabled(false)}
                                g4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h4 = button text:' ',
                                        actionPerformed: {showPos(h4, 3, 7, Board.board)
                                            h4.setEnabled(false)}
                                h4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i4 = button text:' ',
                                        actionPerformed: {showPos(i4, 3, 8, Board.board)
                                            i4.setEnabled(false)}
                                i4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j4 = button text:' ',
                                        actionPerformed: {showPos(j4, 3, 9, Board.board)
                                            j4.setEnabled(false)}
                                j4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k4 = button text:'  ',
                                        actionPerformed: {showPos(k4, 3, 10, Board.board)
                                            k4.setEnabled(false)}
                                k4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l4 = button text:'  ',
                                        actionPerformed: {showPos(l4, 3, 11, Board.board)
                                            l4.setEnabled(false)}
                                l4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m4 = button text:'  ',
                                        actionPerformed: {showPos(m4, 3, 12, Board.board)
                                            m4.setEnabled(false)}
                                m4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n4 = button text:'  ',
                                        actionPerformed: {showPos(n4, 3, 13, Board.board)
                                            n4.setEnabled(false)}
                                n4.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o4 = button text:'  ',
                                        actionPerformed: {showPos(o4, 3, 14, Board.board)
                                            o4.setEnabled(false)}
                                o4.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '5'
                            }
                            td {
                                a5 = button text:' ',
                                        actionPerformed: {showPos(a5, 4, 0, Board.board)
                                            a5.setEnabled(false)}
                                a5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b5 = button text:' ',
                                        actionPerformed: {showPos(b5, 4, 1, Board.board)
                                            b5.setEnabled(false)}
                                b5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c5 = button text:' ',
                                        actionPerformed: {showPos(c5, 4, 2, Board.board)
                                            c5.setEnabled(false)}
                                c5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d5 = button text:' ',
                                        actionPerformed: {showPos(d5, 4, 3, Board.board)
                                            d5.setEnabled(false)}
                                d5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e5 = button text:' ',
                                        actionPerformed: {showPos(e5, 4, 4, Board.board)
                                            e5.setEnabled(false)}
                                e5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f5 = button text:' ',
                                        actionPerformed: {showPos(f5, 4, 5, Board.board)
                                            f5.setEnabled(false)}
                                f5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g5 = button text:' ',
                                        actionPerformed: {showPos(g5, 4, 6, Board.board)
                                            g5.setEnabled(false)}
                                g5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h5 = button text:' ',
                                        actionPerformed: {showPos(h5, 4, 7, Board.board)
                                            h5.setEnabled(false)}
                                h5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i5 = button text:' ',
                                        actionPerformed: {showPos(i5, 4, 8, Board.board)
                                            i5.setEnabled(false)}
                                i5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j5 = button text:' ',
                                        actionPerformed: {showPos(j5, 4, 9, Board.board)
                                            j5.setEnabled(false)}
                                j5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k5 = button text:'  ',
                                        actionPerformed: {showPos(k5, 4, 10, Board.board)
                                            k5.setEnabled(false)}
                                k5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l5 = button text:'  ',
                                        actionPerformed: {showPos(l5, 4, 11, Board.board)
                                            l5.setEnabled(false)}
                                l5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m5 = button text:'  ',
                                        actionPerformed: {showPos(m5, 4, 12, Board.board)
                                            m5.setEnabled(false)}
                                m5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n5 = button text:'  ',
                                        actionPerformed: {showPos(n5, 4, 13, Board.board)
                                            n5.setEnabled(false)}
                                n5.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o5 = button text:'  ',
                                        actionPerformed: {showPos(o5, 4, 14, Board.board)
                                            o5.setEnabled(false)}
                                o5.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '6'
                            }
                            td {
                                a6 = button text:' ',
                                        actionPerformed: {showPos(a6, 5, 0, Board.board)
                                            a6.setEnabled(false)}
                                a6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b6 = button text:' ',
                                        actionPerformed: {showPos(b6, 5, 1, Board.board)
                                            b6.setEnabled(false)}
                                b6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c6 = button text:' ',
                                        actionPerformed: {showPos(c6, 5, 2, Board.board)
                                            c6.setEnabled(false)}
                                c6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d6 = button text:' ',
                                        actionPerformed: {showPos(d6, 5, 3, Board.board)
                                            d6.setEnabled(false)}
                                d6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e6 = button text:' ',
                                        actionPerformed: {showPos(e6, 5, 4, Board.board)
                                            e6.setEnabled(false)}
                                e6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f6 = button text:' ',
                                        actionPerformed: {showPos(f6, 5, 5, Board.board)
                                            f6.setEnabled(false)}
                                f6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g6 = button text:' ',
                                        actionPerformed: {showPos(g6, 5, 6, Board.board)
                                            g6.setEnabled(false)}
                                g6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h6 = button text:' ',
                                        actionPerformed: {showPos(h6, 5, 7, Board.board)
                                            h6.setEnabled(false)}
                                h6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i6 = button text:' ',
                                        actionPerformed: {showPos(i6, 5, 8, Board.board)
                                            i6.setEnabled(false)}
                                i6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j6 = button text:' ',
                                        actionPerformed: {showPos(j6, 5, 9, Board.board)
                                            j6.setEnabled(false)}
                                j6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k6 = button text:'  ',
                                        actionPerformed: {showPos(k6, 5, 10, Board.board)
                                            k6.setEnabled(false)}
                                k6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l6 = button text:'  ',
                                        actionPerformed: {showPos(l6, 5, 11, Board.board)
                                            l6.setEnabled(false)}
                                l6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m6 = button text:'  ',
                                        actionPerformed: {showPos(m6, 5, 12, Board.board)
                                            m6.setEnabled(false)}
                                m6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n6 = button text:'  ',
                                        actionPerformed: {showPos(n6, 5, 13, Board.board)
                                            n6.setEnabled(false)}
                                n6.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o6 = button text:'  ',
                                        actionPerformed: {showPos(o6, 5, 14, Board.board)
                                            o6.setEnabled(false)}
                                o6.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '7'
                            }
                            td {
                                a7 = button text:' ',
                                        actionPerformed: {showPos(a7, 6, 0, Board.board)
                                            a7.setEnabled(false)}
                                a7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b7 = button text:' ',
                                        actionPerformed: {showPos(b7, 6, 1, Board.board)
                                            b7.setEnabled(false)}
                                b7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c7 = button text:' ',
                                        actionPerformed: {showPos(c7, 6, 2, Board.board)
                                            c7.setEnabled(false)}
                                c7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d7 = button text:' ',
                                        actionPerformed: {showPos(d7, 6, 3, Board.board)
                                            d7.setEnabled(false)}
                                d7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e7 = button text:' ',
                                        actionPerformed: {showPos(e7, 6, 4, Board.board)
                                            e7.setEnabled(false)}
                                e7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f7 = button text:' ',
                                        actionPerformed: {showPos(f7, 6, 5, Board.board)
                                            f7.setEnabled(false)}
                                f7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g7 = button text:' ',
                                        actionPerformed: {showPos(g7, 6, 6, Board.board)
                                            g7.setEnabled(false)}
                                g7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h7 = button text:' ',
                                        actionPerformed: {showPos(h7, 6, 7, Board.board)
                                            h7.setEnabled(false)}
                                h7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i7 = button text:' ',
                                        actionPerformed: {showPos(i7, 6, 8, Board.board)
                                            i7.setEnabled(false)}
                                i7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j7 = button text:' ',
                                        actionPerformed: {showPos(j7, 6, 9, Board.board)
                                            j7.setEnabled(false)}
                                j7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k7 = button text:'  ',
                                        actionPerformed: {showPos(k7, 6, 10, Board.board)
                                            k7.setEnabled(false)}
                                k7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l7 = button text:'  ',
                                        actionPerformed: {showPos(l7, 6, 11, Board.board)
                                            l7.setEnabled(false)}
                                l7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m7 = button text:'  ',
                                        actionPerformed: {showPos(m7, 6, 12, Board.board)
                                            m7.setEnabled(false)}
                                m7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n7 = button text:'  ',
                                        actionPerformed: {showPos(n7, 6, 13, Board.board)
                                            n7.setEnabled(false)}
                                n7.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o7 = button text:'  ',
                                        actionPerformed: {showPos(o7, 6, 14, Board.board)
                                            o7.setEnabled(false)}
                                o7.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '8'
                            }
                            td {
                                a8 = button text:' ',
                                        actionPerformed: {showPos(a8, 7, 0, Board.board)
                                            a8.setEnabled(false)}
                                a8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b8 = button text:' ',
                                        actionPerformed: {showPos(b8, 7, 1, Board.board)
                                            b8.setEnabled(false)}
                                b8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c8 = button text:' ',
                                        actionPerformed: {showPos(c8, 7, 2, Board.board)
                                            c8.setEnabled(false)}
                                c8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d8 = button text:' ',
                                        actionPerformed: {showPos(d8, 7, 3, Board.board)
                                            d8.setEnabled(false)}
                                d8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e8 = button text:' ',
                                        actionPerformed: {showPos(e8, 7, 4, Board.board)
                                            e8.setEnabled(false)}
                                e8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f8 = button text:' ',
                                        actionPerformed: {showPos(f8, 7, 5, Board.board)
                                            f8.setEnabled(false)}
                                f8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g8 = button text:' ',
                                        actionPerformed: {showPos(g8, 7, 6, Board.board)
                                            g8.setEnabled(false)}
                                g8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h8 = button text:' ',
                                        actionPerformed: {showPos(h8, 7, 7, Board.board)
                                            h8.setEnabled(false)}
                                h8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i8 = button text:' ',
                                        actionPerformed: {showPos(i8, 7, 8, Board.board)
                                            i8.setEnabled(false)}
                                i8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j8 = button text:' ',
                                        actionPerformed: {showPos(j8, 7, 9, Board.board)
                                            j8.setEnabled(false)}
                                j8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k8 = button text:'  ',
                                        actionPerformed: {showPos(k8, 7, 10, Board.board)
                                            k8.setEnabled(false)}
                                k8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l8 = button text:'  ',
                                        actionPerformed: {showPos(l8, 7, 11, Board.board)
                                            l8.setEnabled(false)}
                                l8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m8 = button text:'  ',
                                        actionPerformed: {showPos(m8, 7, 12, Board.board)
                                            m8.setEnabled(false)}
                                m8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n8 = button text:'  ',
                                        actionPerformed: {showPos(n8, 7, 13, Board.board)
                                            n8.setEnabled(false)}
                                n8.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o8 = button text:'  ',
                                        actionPerformed: {showPos(o8, 7, 14, Board.board)
                                            o8.setEnabled(false)}
                                o8.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '9'
                            }
                            td {
                                a9 = button text:' ',
                                        actionPerformed: {showPos(a9, 8, 0, Board.board)
                                            a9.setEnabled(false)}
                                a9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b9 = button text:' ',
                                        actionPerformed: {showPos(b9, 8, 1, Board.board)
                                            b9.setEnabled(false)}
                                b9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c9 = button text:' ',
                                        actionPerformed: {showPos(c9, 8, 2, Board.board)
                                            c9.setEnabled(false)}
                                c9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d9 = button text:' ',
                                        actionPerformed: {showPos(d9, 8, 3, Board.board)
                                            d9.setEnabled(false)}
                                d9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e9 = button text:' ',
                                        actionPerformed: {showPos(e9, 8, 4, Board.board)
                                            e9.setEnabled(false)}
                                e9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f9 = button text:' ',
                                        actionPerformed: {showPos(f9, 8, 5, Board.board)
                                            f9.setEnabled(false)}
                                f9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g9 = button text:' ',
                                        actionPerformed: {showPos(g9, 8, 6, Board.board)
                                            g9.setEnabled(false)}
                                g9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h9 = button text:' ',
                                        actionPerformed: {showPos(h9, 8, 7, Board.board)
                                            h9.setEnabled(false)}
                                h9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i9 = button text:' ',
                                        actionPerformed: {showPos(i9, 8, 8, Board.board)
                                            i9.setEnabled(false)}
                                i9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j9 = button text:' ',
                                        actionPerformed: {showPos(j9, 8, 9, Board.board)
                                            j9.setEnabled(false)}
                                j9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k9 = button text:'  ',
                                        actionPerformed: {showPos(k9, 8, 10, Board.board)
                                            k9.setEnabled(false)}
                                k9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l9 = button text:'  ',
                                        actionPerformed: {showPos(l9, 8, 11, Board.board)
                                            l9.setEnabled(false)}
                                l9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m9 = button text:'  ',
                                        actionPerformed: {showPos(m9, 8, 12, Board.board)
                                            m9.setEnabled(false)}
                                m9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n9 = button text:'  ',
                                        actionPerformed: {showPos(n9, 8, 13, Board.board)
                                            n9.setEnabled(false)}
                                n9.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o9 = button text:'  ',
                                        actionPerformed: {showPos(o9, 8, 14, Board.board)
                                            o9.setEnabled(false)}
                                o9.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '10'
                            }
                            td {
                                a10 = button text:' ',
                                        actionPerformed: {showPos(a10, 9, 0, Board.board)
                                            a10.setEnabled(false)}
                                a10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b10 = button text:' ',
                                        actionPerformed: {showPos(b10, 9, 1, Board.board)
                                            b10.setEnabled(false)}
                                b10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c10 = button text:' ',
                                        actionPerformed: {showPos(c10, 9, 2, Board.board)
                                            c10.setEnabled(false)}
                                c10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d10 = button text:' ',
                                        actionPerformed: {showPos(d10, 9, 3, Board.board)
                                            d10.setEnabled(false)}
                                d10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e10 = button text:' ',
                                        actionPerformed: {showPos(e10, 9, 4, Board.board)
                                            e10.setEnabled(false)}
                                e10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f10 = button text:' ',
                                        actionPerformed: {showPos(f10, 9, 5, Board.board)
                                            f10.setEnabled(false)}
                                f10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g10 = button text:' ',
                                        actionPerformed: {showPos(g10, 9, 6, Board.board)
                                            g10.setEnabled(false)}
                                g10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h10 = button text:' ',
                                        actionPerformed: {showPos(h10, 9, 7, Board.board)
                                            h10.setEnabled(false)}
                                h10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i10 = button text:' ',
                                        actionPerformed: {showPos(i10, 9, 8, Board.board)
                                            i10.setEnabled(false)}
                                i10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j10 = button text:' ',
                                        actionPerformed: {showPos(j10, 9, 9, Board.board)
                                            j10.setEnabled(false)}
                                j10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k10 = button text:'  ',
                                        actionPerformed: {showPos(k10, 9, 10, Board.board)
                                            k10.setEnabled(false)}
                                k10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l10 = button text:'  ',
                                        actionPerformed: {showPos(l10, 9, 11, Board.board)
                                            l10.setEnabled(false)}
                                l10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m10 = button text:'  ',
                                        actionPerformed: {showPos(m10, 9, 12, Board.board)
                                            m10.setEnabled(false)}
                                m10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n10 = button text:'  ',
                                        actionPerformed: {showPos(n10, 9, 13, Board.board)
                                            n10.setEnabled(false)}
                                n10.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o10 = button text:'  ',
                                        actionPerformed: {showPos(o10, 9, 14, Board.board)
                                            o10.setEnabled(false)}
                                o10.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '11'
                            }
                            td {
                                a11 = button text:' ',
                                        actionPerformed: {showPos(a11, 10, 0, Board.board)
                                            a11.setEnabled(false)}
                                a11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b11 = button text:' ',
                                        actionPerformed: {showPos(b11, 10, 1, Board.board)
                                            b11.setEnabled(false)}
                                b11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c11 = button text:' ',
                                        actionPerformed: {showPos(c11, 10, 2, Board.board)
                                            c11.setEnabled(false)}
                                c11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d11 = button text:' ',
                                        actionPerformed: {showPos(d11, 10, 3, Board.board)
                                            d11.setEnabled(false)}
                                d11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e11 = button text:' ',
                                        actionPerformed: {showPos(e11, 10, 4, Board.board)
                                            e11.setEnabled(false)}
                                e11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f11 = button text:' ',
                                        actionPerformed: {showPos(f11, 10, 5, Board.board)
                                            f11.setEnabled(false)}
                                f11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g11 = button text:' ',
                                        actionPerformed: {showPos(g11, 10, 6, Board.board)
                                            g11.setEnabled(false)}
                                g11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h11 = button text:' ',
                                        actionPerformed: {showPos(h11, 10, 7, Board.board)
                                            h11.setEnabled(false)}
                                h11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i11 = button text:' ',
                                        actionPerformed: {showPos(i11, 10, 8, Board.board)
                                            i11.setEnabled(false)}
                                i11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j11 = button text:' ',
                                        actionPerformed: {showPos(j11, 10, 9, Board.board)
                                            j11.setEnabled(false)}
                                j11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k11 = button text:'  ',
                                        actionPerformed: {showPos(k11, 10, 10, Board.board)
                                            k11.setEnabled(false)}
                                k11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l11 = button text:'  ',
                                        actionPerformed: {showPos(l11, 10, 11, Board.board)
                                            l11.setEnabled(false)}
                                l11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m11 = button text:'  ',
                                        actionPerformed: {showPos(m11, 10, 12, Board.board)
                                            m11.setEnabled(false)}
                                m11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n11 = button text:'  ',
                                        actionPerformed: {showPos(n11, 10, 13, Board.board)
                                            n11.setEnabled(false)}
                                n11.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o11 = button text:'  ',
                                        actionPerformed: {showPos(o11, 10, 14, Board.board)
                                            o11.setEnabled(false)}
                                o11.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '12'
                            }
                            td {
                                a12 = button text:' ',
                                        actionPerformed: {showPos(a12, 11, 0, Board.board)
                                            a12.setEnabled(false)}
                                a12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b12 = button text:' ',
                                        actionPerformed: {showPos(b12, 11, 1, Board.board)
                                            b12.setEnabled(false)}
                                b12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c12 = button text:' ',
                                        actionPerformed: {showPos(c12, 11, 2, Board.board)
                                            c12.setEnabled(false)}
                                c12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d12 = button text:' ',
                                        actionPerformed: {showPos(d12, 11, 3, Board.board)
                                            d12.setEnabled(false)}
                                d12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e12 = button text:' ',
                                        actionPerformed: {showPos(e12, 11, 4, Board.board)
                                            e12.setEnabled(false)}
                                e12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f12 = button text:' ',
                                        actionPerformed: {showPos(f12, 11, 5, Board.board)
                                            f12.setEnabled(false)}
                                f12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g12 = button text:' ',
                                        actionPerformed: {showPos(g12, 11, 6, Board.board)
                                            g12.setEnabled(false)}
                                g12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h12 = button text:' ',
                                        actionPerformed: {showPos(h12, 11, 7, Board.board)
                                            h12.setEnabled(false)}
                                h12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i12 = button text:' ',
                                        actionPerformed: {showPos(i12, 11, 8, Board.board)
                                            i12.setEnabled(false)}
                                i12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j12 = button text:' ',
                                        actionPerformed: {showPos(j12, 11, 9, Board.board)
                                            j12.setEnabled(false)}
                                j12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k12 = button text:'  ',
                                        actionPerformed: {showPos(k12, 11, 10, Board.board)
                                            k12.setEnabled(false)}
                                k12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l12 = button text:'  ',
                                        actionPerformed: {showPos(l12, 11, 11, Board.board)
                                            l12.setEnabled(false)}
                                l12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m12 = button text:'  ',
                                        actionPerformed: {showPos(m12, 11, 12, Board.board)
                                            m12.setEnabled(false)}
                                m12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n12 = button text:'  ',
                                        actionPerformed: {showPos(n12, 11, 13, Board.board)
                                            n12.setEnabled(false)}
                                n12.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o12 = button text:'  ',
                                        actionPerformed: {showPos(o12, 11, 14, Board.board)
                                            o12.setEnabled(false)}
                                o12.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '13'
                            }
                            td {
                                a13 = button text:' ',
                                        actionPerformed: {showPos(a13, 12, 0, Board.board)
                                            a13.setEnabled(false)}
                                a13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b13 = button text:' ',
                                        actionPerformed: {showPos(b13, 12, 1, Board.board)
                                            b13.setEnabled(false)}
                                b13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c13 = button text:' ',
                                        actionPerformed: {showPos(c13, 12, 2, Board.board)
                                            c13.setEnabled(false)}
                                c13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d13 = button text:' ',
                                        actionPerformed: {showPos(d13, 12, 3, Board.board)
                                            d13.setEnabled(false)}
                                d13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e13 = button text:' ',
                                        actionPerformed: {showPos(e13, 12, 4, Board.board)
                                            e13.setEnabled(false)}
                                e13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f13 = button text:' ',
                                        actionPerformed: {showPos(f13, 12, 5, Board.board)
                                            f13.setEnabled(false)}
                                f13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g13 = button text:' ',
                                        actionPerformed: {showPos(g13, 12, 6, Board.board)
                                            g13.setEnabled(false)}
                                g13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h13 = button text:' ',
                                        actionPerformed: {showPos(h13, 12, 7, Board.board)
                                            h13.setEnabled(false)}
                                h13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i13 = button text:' ',
                                        actionPerformed: {showPos(i13, 12, 8, Board.board)
                                            i13.setEnabled(false)}
                                i13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j13 = button text:' ',
                                        actionPerformed: {showPos(j13, 12, 9, Board.board)
                                            j13.setEnabled(false)}
                                j13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k13 = button text:'  ',
                                        actionPerformed: {showPos(k13, 12, 10, Board.board)
                                            k13.setEnabled(false)}
                                k13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l13 = button text:'  ',
                                        actionPerformed: {showPos(l13, 12, 11, Board.board)
                                            l13.setEnabled(false)}
                                l13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m13 = button text:'  ',
                                        actionPerformed: {showPos(m13, 12, 12, Board.board)
                                            m13.setEnabled(false)}
                                m13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n13 = button text:'  ',
                                        actionPerformed: {showPos(n13, 12, 13, Board.board)
                                            n13.setEnabled(false)}
                                n13.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o13 = button text:'  ',
                                        actionPerformed: {showPos(o13, 12, 14, Board.board)
                                            o13.setEnabled(false)}
                                o13.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '14'
                            }
                            td {
                                a14 = button text:' ',
                                        actionPerformed: {showPos(a14, 13, 0, Board.board)
                                            a14.setEnabled(false)}
                                a14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b14 = button text:' ',
                                        actionPerformed: {showPos(b14, 13, 1, Board.board)
                                            b14.setEnabled(false)}
                                b14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c14 = button text:' ',
                                        actionPerformed: {showPos(c14, 13, 2, Board.board)
                                            c14.setEnabled(false)}
                                c14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d14 = button text:' ',
                                        actionPerformed: {showPos(d14, 13, 3, Board.board)
                                            d14.setEnabled(false)}
                                d14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e14 = button text:' ',
                                        actionPerformed: {showPos(e14, 13, 4, Board.board)
                                            e14.setEnabled(false)}
                                e14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f14 = button text:' ',
                                        actionPerformed: {showPos(f14, 13, 5, Board.board)
                                            f14.setEnabled(false)}
                                f14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g14 = button text:' ',
                                        actionPerformed: {showPos(g14, 13, 6, Board.board)
                                            g14.setEnabled(false)}
                                g14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h14 = button text:' ',
                                        actionPerformed: {showPos(h14, 13, 7, Board.board)
                                            h14.setEnabled(false)}
                                h14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i14 = button text:' ',
                                        actionPerformed: {showPos(i14, 13, 8, Board.board)
                                            i14.setEnabled(false)}
                                i14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j14 = button text:' ',
                                        actionPerformed: {showPos(j14, 13, 9, Board.board)
                                            j14.setEnabled(false)}
                                j14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k14 = button text:'  ',
                                        actionPerformed: {showPos(k14, 13, 10, Board.board)
                                            k14.setEnabled(false)}
                                k14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l14 = button text:'  ',
                                        actionPerformed: {showPos(l14, 13, 11, Board.board)
                                            l14.setEnabled(false)}
                                l14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m14 = button text:'  ',
                                        actionPerformed: {showPos(m14, 13, 12, Board.board)
                                            m14.setEnabled(false)}
                                m14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n14 = button text:'  ',
                                        actionPerformed: {showPos(n14, 13, 13, Board.board)
                                            n14.setEnabled(false)}
                                n14.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o14 = button text:'  ',
                                        actionPerformed: {showPos(o14, 13, 14, Board.board)
                                            o14.setEnabled(false)}
                                o14.setPreferredSize(new Dimension(50,30))
                            }
                        }
                        tr {
                            td {
                                label '15'
                            }
                            td {
                                a15 = button text:' ',
                                        actionPerformed: {showPos(a15, 14, 0, Board.board)
                                            a15.setEnabled(false)}
                                a15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                b15 = button text:' ',
                                        actionPerformed: {showPos(b15, 14, 1, Board.board)
                                            b15.setEnabled(false)}
                                b15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                c15 = button text:' ',
                                        actionPerformed: {showPos(c15, 14, 2, Board.board)
                                            c15.setEnabled(false)}
                                c15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                d15 = button text:' ',
                                        actionPerformed: {showPos(d15, 14, 3, Board.board)
                                            d15.setEnabled(false)}
                                d15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                e15 = button text:' ',
                                        actionPerformed: {showPos(e15, 14, 4, Board.board)
                                            e15.setEnabled(false)}
                                e15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                f15 = button text:' ',
                                        actionPerformed: {showPos(f15, 14, 5, Board.board)
                                            f15.setEnabled(false)}
                                f15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                g15 = button text:' ',
                                        actionPerformed: {showPos(g15, 14, 6, Board.board)
                                            g15.setEnabled(false)}
                                g15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                h15 = button text:' ',
                                        actionPerformed: {showPos(h15, 14, 7, Board.board)
                                            h15.setEnabled(false)}
                                h15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                i15 = button text:' ',
                                        actionPerformed: {showPos(i15, 14, 8, Board.board)
                                            i15.setEnabled(false)}
                                i15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                j15 = button text:' ',
                                        actionPerformed: {showPos(j15, 14, 9, Board.board)
                                            j15.setEnabled(false)}
                                j15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                k15 = button text:'  ',
                                        actionPerformed: {showPos(k15, 14, 10, Board.board)
                                            k15.setEnabled(false)}
                                k15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                l15 = button text:'  ',
                                        actionPerformed: {showPos(l15, 14, 11, Board.board)
                                            l15.setEnabled(false)}
                                l15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                m15 = button text:'  ',
                                        actionPerformed: {showPos(m15, 14, 12, Board.board)
                                            m15.setEnabled(false)}
                                m15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                n15 = button text:'  ',
                                        actionPerformed: {showPos(n15, 14, 13, Board.board)
                                            n15.setEnabled(false)}
                                n15.setPreferredSize(new Dimension(50,30))
                            }
                            td {
                                o15 = button text:'  ',
                                        actionPerformed: {showPos(o15, 14, 14, Board.board)
                                            o15.setEnabled(false)}
                                o15.setPreferredSize(new Dimension(50,30))
                            }
                        }
                    }
                }
            }

        }
        /*builder.optionPane().showMessageDialog(null, 'Regras do jogo:' + '\n'
                + 'Você tem 50 Torpedos para destruir a frota inimiga.' + '\n'
                + 'Se não a destruir neste tempo, o contra-ataque do inimigo' + '\n'
                + 'irá destruir sua frota. Boa sorte.')*/
    }


    static int navios = Constants.num_targets

    static void testa(){

         navios--
        if(navios == 0)
            println("Voce ganhou")

    }

    static void showPos (JButton b, int row, int col, ArrayList<Integer> board) {
        int pos = (board[row][col] as Integer)
        switch (pos) {
            case 1:
                b.setForeground(Color.RED)
                b.setText('M') // M for Mine
                testa()
                break
            case 2:
                b.setText('S') // S for Submarine
                testa()
                break
            case 3:
                b.setText('B') // B for Battleship
                testa()
                break
            default:
                b.setText('W') // W for Water
                break
        }
    }
}

