package game;

import java.util.Random;

public class test {
    public static void main(String ... args){
        Random random = new Random();
       /* System.out.println(random.nextInt(8)+1);
        System.out.println(random.nextInt(8)+1);
        System.out.println(random.nextInt(8)+1);
        System.out.println(random.nextInt(8)+1);
        System.out.println(random.nextInt(8)+1);
        System.out.println(random.nextInt(8)+1);*/
       int a = 0;
       while (a++<40){
           System.out.print(a +" ");

/*
    private int[] cellNum = {1,2,3,4,5,6,7,8,9 };//all possibilities of a cell
           // initializing the possibilities into the 9 cell divisions
       private int [][] cell1 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell2 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell3 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell4 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell5 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell6 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell7 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell8 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };
       private int [][] cell9 = { cellNum,cellNum,cellNum, cellNum,cellNum,cellNum,cellNum,cellNum,cellNum };

            //initializing the 9 cell divisions into the grid
    private int[][][] cells = {
            cell1 ,cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9
    };*/
  /*         while(isNotUsedInCellGroup(randm, num)){
               while(isNotUsedInColumn(randm, row, num)){
                   while(isNotUsedInRow(randm, row, num)){
                       replaceAllZeroInCell(randm, row);
                       replaceWithZeroTheCellGroup(randm, num);
                       replaceZeroToColumn(randm, row, num);
                       replaceZeroToRow(randm, row, num);
                       System.out.println(row);
                       System.out.println("inserting "  + num);
                       solution[randm][row] = num;
                       row = getRandomNumber(9);
                       System.out.println(row);
                   }
               }
           }*/

  /* if(cellGroup == 0 || cellGroup == 1 || cellGroup ==2){
            for(int i = 0; i<=2; i++){
                if(row == 0 || row ==1 || row==2){
                    for (int a =0 ; a<=2; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }else if(row == 3|| row == 4|| row ==5){
                    for (int a =3 ; a<=5; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }else{
                    for (int a =6 ; a<=8; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }
            }
        }else if(cellGroup==3 || cellGroup==4 || cellGroup==5){
            for(int i = 3; i<=5; i++){
                if(row == 0 || row ==1 || row==2){
                    for (int a =0 ; a<=2; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }else if(row == 3|| row == 4|| row ==5){
                    for (int a =3 ; a<=5; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }else{
                    for (int a =6 ; a<=8; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }
            }
        }else if(cellGroup==6 || cellGroup==7 || cellGroup==8){
            for(int i = 6; i<=8; i++){
                if(row == 0 || row ==1 || row==2){
                    for (int a =0 ; a<=2; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }else if(row == 3|| row == 4|| row ==5){
                    for (int a =3 ; a<=5; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }else{
                    for (int a =6 ; a<=8; a++){
                        if(solution [cellGroup][a] == num){
                            return true;
                        }
                    }
                }
            }
        }
     */


       /* private void replaceZeroToRow(int cellGroup, int row, int num){
            if(cellGroup == 0 || cellGroup == 1 || cellGroup ==2){
                for(int i = 0; i<=2; i++){
                    if(row == 0 || row ==1 || row==2){
                       for (int a =0 ; a<=2; a++){
                           cells [i][a][num-1] = 0;
                       }
                    }else if(row == 3|| row == 4|| row ==5){
                        for (int a =3 ; a<=5; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }else{
                        for (int a =6 ; a<=8; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }
                }
            }else if(cellGroup==3 || cellGroup==4 || cellGroup==5){
                for(int i = 3; i<=5; i++){
                    if(row == 0 || row ==1 || row==2){
                        for (int a =0 ; a<=2; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }else if(row == 3|| row == 4|| row ==5){
                        for (int a =3 ; a<=5; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }else{
                        for (int a =6 ; a<=8; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }
                }
            }else if(cellGroup==6 || cellGroup==7 || cellGroup==8){
                for(int i = 6; i<=8; i++){
                    if(row == 0 || row ==1 || row==2){
                        for (int a =0 ; a<=2; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }else if(row == 3|| row == 4|| row ==5){
                        for (int a =3 ; a<=5; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }else{
                        for (int a =6 ; a<=8; a++){
                            cells [i][a][num-1] = 0;
                        }
                    }
                }
            }
        }
        private void replaceZeroToColumn(int cellGroup, int row, int num){
            if(cellGroup == 0 || cellGroup == 3 || cellGroup ==6){
                for(int i = 0; i<=6; i+=3){
                    if(row == 0 || row ==3 || row==6){
                        for (int a =0 ; a<=6; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }else if(row == 1|| row == 4|| row ==7){
                        for (int a =1 ; a<=7; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }else{
                        for (int a =2 ; a<=8; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }
                }
            }else if(cellGroup==1 || cellGroup==4 || cellGroup==7){
                for(int i = 1; i<=7; i+=3){
                    if(row == 0 || row ==3 || row==6){
                        for (int a =0 ; a<=6; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }else if(row == 1|| row == 4|| row ==7){
                        for (int a =1 ; a<=7; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }else{
                        for (int a =2 ; a<=8; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }
                }
            }else if(cellGroup==2 || cellGroup==5 || cellGroup==8){
                for(int i = 2; i<=8; i+=3){
                    if(row == 0 || row ==3 || row==6){
                        for (int a =0 ; a<=6; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }else if(row == 1|| row == 4|| row ==7){
                        for (int a =1 ; a<=7; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }else{
                        for (int a =2 ; a<=8; a+=3){
                            cells [i][a][num-1] = 0;
                        }
                    }
                }
            }
        }

*/

  /*      private void replaceWithZeroTheCellGroup(int cellGroup,  int num){
            for (int i = 0; i<=8; i++){
                cells [cellGroup][i][num-1] = 0;
            }
        }

        private void replaceAllZeroInCell(int cellGroup , int row){
        for(int i = 0; i<=8; i++){
            cells [cellGroup][row][i] = 0;
        }
        }*/
//cellGroup //cell
/*
   */
       }
    }
}
