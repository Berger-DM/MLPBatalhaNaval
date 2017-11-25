
class BackEnd {

        static final int battleship = 3
        static final int submarine = 2
        static final int mine = 1
        static final int size = 10
        static final int horizontal = 0
        static final int vertical = 1
        static final int num_battleships = 3
        static final int num_submarines = 4
        static final int num_mines = 5

        static List<Integer> board = new ArrayList<Integer>()

        void initBoard() {
            for (int i = 0; i < size * size; i++) {

                board << 0
            }
            board = board.collate(size)
        }


        
        boolean possiblePlacementVert(int x_coord, int y_coord, int ship_size) {

            for (int i = 0; i < ship_size; i++) {

                    if (board[x_coord][y_coord + i] != 0)
                        return false
                }

            return true
        }


        boolean possiblePlacementHor(int x_coord, int y_coord, int ship_size) {

            for (int i = 0; i < ship_size; i++) {

                if (board[x_coord + i][y_coord] != 0)
                    return false
            }

            return true
        }


        void generator(int ship_size) {

            int x_coord, y_coord, orientation
            boolean flag = false

            orientation = (int) (Math.random() * (2))

            if (orientation == vertical) {

                while (!flag) {

                    x_coord = (int) (Math.random() * (size))
                    y_coord = (int) (Math.random() * (size - ship_size))

                    flag = possiblePlacementVert(x_coord, y_coord, ship_size)

                }

                for (int i = 0; i < ship_size; i++) {

                    board[x_coord][y_coord + i] = ship_size
                }
            }


            if (orientation == horizontal) {

                while (!flag) {

                    x_coord = (int) (Math.random() * (size - ship_size))
                    y_coord = (int) (Math.random() * (size))

                    flag = possiblePlacementHor(x_coord, y_coord, ship_size)
                }

                for (int i = 0; i < ship_size; i++) {

                    board[x_coord + i][y_coord] = ship_size
                }
            }

        }

        
        void shipsPlacement() {

            for (int i = 0; i < num_battleships; i++) {
                generator(battleship)
            }


            for(int i = 0; i < num_submarines; i++){
                generator(submarine)
            }

            for(int i = 0; i < num_mines; i++){
                generator(mine)
            }

        }

        BackEnd(){

            initBoard()
            shipsPlacement()
        }
}
