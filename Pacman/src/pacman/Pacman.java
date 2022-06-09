package pacman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Subin
 */
public class Pacman extends JPanel implements ActionListener {
    private Dimension d;
    private Image ii;
    private final Color dotColor = Color.gray;
    private Color colorBoard;
    private boolean isInGame = false,isdead = false;
    private final int gridSize = 24;
    private final int maxGhost = 12;
    private final int pacSpeed = 6;
    private int nGhost, pacsLeft, score;
    private int[] dx, dy, ghost_x, ghost_y, ghost_x_dir, ghost_y_dir, ghostSpeed;
    private Image ghost_image,pacman_image;
    //pacman x,y position , previous x,y direction , and current x,y direction
    private int pacman_x, pacman_y, pacman_pre_x_dir, pacman_pre_y_dir, pacman_x_dir, pacman_y_dir;
    //board array
    //0 is gap
    //19 is left corner wall
    //18 up wall
    //21 left wall and food and wall
    private final short[][] BoardData = {
        {0, 19, 26, 26, 26, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18, 22},
        {0, 21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16,16,16,16,16,16, 20},
        {0, 21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 24, 24, 24, 24, 24, 24, 16, 16, 16,16,16,16,16,16, 20},
        {0, 21, 0, 0, 0, 17, 16, 16, 24, 16, 16, 16, 16, 16, 16, 20,0, 0, 0, 0, 0, 0, 17, 16, 16,16,16,16,16,16,20},
        {0, 17, 18, 18, 18, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16,16,18, 18, 18, 18, 18, 18, 16, 16, 16,16,16,16,16,16, 20},
        {0, 17, 16, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16,16,24,24, 24, 24, 24, 24, 16, 16, 16,16,16,16,16,16, 20},
        {0, 25, 16, 16, 16, 24, 24, 28, 0, 25, 24, 24, 16, 16, 16, 20,0, 0, 0, 0, 0, 0, 17, 16, 16,16,16,16,16,16,20},
        {0, 1, 17, 16, 20, 0, 0, 0, 0, 0, 0, 0, 17, 16,16,16,18, 18, 18, 18, 18, 18, 16, 16, 16,16,16,16,16,16, 20},
        {0, 1, 17, 16, 16, 18, 18, 22, 0, 19, 18, 18, 16, 16,16, 16,16, 16, 16, 16, 8, 8, 8, 8, 8,16,16,16,16,16, 20},
        {0, 1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0, 0, 0, 0, 0,17,16,16,16,16,20},
        {0, 1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 16,16, 16, 16, 16, 26, 26, 26, 26, 26,16,16,16,16,16, 20},
        {0, 1, 17, 16, 16, 16, 16, 16, 18, 16, 16, 16, 16, 16, 16, 16,16, 16, 16, 20, 0, 0, 0, 0, 0,17,16,16,16,16, 20},
        {0, 1, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16,16, 16, 16, 20, 0, 0, 0, 0, 0,25,16,16,16,16, 20},
        {0, 1, 25, 24, 24, 24, 24, 24, 24, 24, 24, 16, 16, 16, 16, 16, 16, 16, 16, 28,0, 0, 0, 0, 0,0,17,16,16,16,20},
        {0, 9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 25, 24, 24, 24, 24, 24, 24, 28, 8, 8, 8, 8, 8, 8, 8, 25, 24, 24, 24, 28}
    };
    private final int blocks_y=BoardData.length,blocks_x=BoardData[0].length;
    private final int screen_size = (blocks_x) * gridSize;
    private final int[] speeds = {1, 2, 3, 4, 6, 8};
    private final int maxSpeed = 10;
    private int init_speed;
    private short[] screenData;//1d array of level data
   
    private Timer timer;

    public Pacman() {
        loadImages();
        initializeVar();
        initBoard();
    }
    //set board for first time
    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.black);
    }
    //variables that has to be iniatilized
    private void initializeVar() {
        screenData = new short[blocks_x * blocks_y];
        colorBoard = Color.blue;
        d = new Dimension(400, 400);
        ghost_x = new int[maxGhost];
        ghost_x_dir = new int[maxGhost];
        ghost_y = new int[maxGhost];
        ghost_y_dir = new int[maxGhost];
        ghostSpeed = new int[maxGhost];
        dx = new int[4];
        dy = new int[4];
        timer = new Timer(10, this);
        timer.start();
    }
    //check if player is dead if not redraw all things 
    private void playGame(Graphics2D g2d) {
        if (isdead) {
            death();
        } else {
            movePacman();
            drawPacman(g2d);
            moveGhosts(g2d);
            checkBoard();
        }
    }
    //when opening
    private void showIntro(Graphics2D g2d) {
        initGame();
        g2d.setColor(new Color(0, 32, 48));
        g2d.fillRect(50, screen_size / 4, screen_size - 100, 50);
        g2d.setColor(Color.white);
        g2d.drawRect(50, screen_size / 4, screen_size - 100, 50);
        String s = "Press S to start.";
        g2d.setColor(Color.white);
        g2d.drawString(s, 300, screen_size / 3 - 33);
    }
//draw score
    private void drawScore(Graphics2D g) {
        int i;
        String s;
        g.setColor(new Color(96, 128, 255));
        s = "Score: " + score;
        g.drawString(s, screen_size-50, blocks_y*gridSize + 16);
        for (i = 0; i < pacsLeft; i++) {
            g.drawImage(pacman_image, i * 28 + 30, blocks_y*gridSize + 1, this);
        }
    }
//check board to see if evel is finished
    private void checkBoard() {
        short i = 0;
        boolean finished = true;
        while (i < blocks_x * blocks_y) {
            if ((screenData[i] & 48) != 0) {
                finished = false;
            }
            i++;
        }
        //if level is finished
        if (finished) {
            score += 50;
            if (nGhost < maxGhost) {
                nGhost++;
            }
            if (init_speed < maxSpeed) {
                init_speed++;
            }
            initilize_level();
        }
    }
//check if player is dead
    private void death() {
        pacsLeft--;
        if (pacsLeft == 0) {
            isInGame = false;
        }
        continueLevel();
    }
//check block_x
    private void moveGhosts(Graphics2D g2d) {
        short i;
        int pos;
        int count;
        //check if the block in position ghost is going to is a wall
        //if true go to given direction
        //else choose a random direction to move towards
        for (i = 0; i < nGhost; i++) {
            if (ghost_x[i] % gridSize == 0 && ghost_y[i] % gridSize == 0) {
                pos = ghost_x[i] / gridSize + blocks_x * (int) (ghost_y[i] / gridSize);
                count = 0;
                if ((screenData[pos] & 1) == 0 && ghost_x_dir[i] != 1) {
                    dx[count] = -1;
                    dy[count] = 0;
                    count++;
                }
                if ((screenData[pos] & 2) == 0 && ghost_y_dir[i] != 1) {
                    dx[count] = 0;
                    dy[count] = -1;
                    count++;
                }
                if ((screenData[pos] & 4) == 0 && ghost_x_dir[i] != -1) {
                    dx[count] = 1;
                    dy[count] = 0;
                    count++;
                }
                if ((screenData[pos] & 8) == 0 && ghost_y_dir[i] != -1) {
                    dx[count] = 0;
                    dy[count] = 1;
                    count++;
                }
                if (count == 0) {
                    if ((screenData[pos] & 15) == 15) {
                        ghost_x_dir[i] = 0;
                        ghost_y_dir[i] = 0;
                    } else {
                        ghost_x_dir[i] = -ghost_x_dir[i];
                        ghost_y_dir[i] = -ghost_y_dir[i];
                    }
                } else {
                    count = (int) (Math.random() * count);
                    if (count > 3) {
                        count = 3;
                    }
                    ghost_x_dir[i] = dx[count];
                    ghost_y_dir[i] = dy[count];
                }
            }
            ghost_x[i] = ghost_x[i] + (ghost_x_dir[i] * ghostSpeed[i]);
            ghost_y[i] = ghost_y[i] + (ghost_y_dir[i] * ghostSpeed[i]);
            drawGhost(g2d, ghost_x[i] + 1, ghost_y[i] + 1);
            if (pacman_x > (ghost_x[i] - 12) && pacman_x < (ghost_x[i] + 12) && pacman_y > (ghost_y[i] - 12) && pacman_y < (ghost_y[i] + 12 )&& isInGame) {
                isdead = true;
            }
        }
    }
//draw ghosts
    private void drawGhost(Graphics2D g2d, int x, int y) {
        g2d.drawImage(ghost_image, x, y, this);
    }
//check block_x
    private void movePacman() {
        int pos;
        short ch;
        //check if the direction pacman is movng has wall 
        //if true go to standstill condition
        //wlse continue moving till inturruption
        if (pacman_x_dir == -pacman_pre_x_dir && pacman_y_dir == -pacman_pre_y_dir) {
            pacman_pre_x_dir = pacman_x_dir;
            pacman_pre_y_dir = pacman_y_dir;
        }
        if (pacman_x % gridSize == 0 && pacman_y % gridSize == 0) {
            pos = pacman_x / gridSize + blocks_x * (int) (pacman_y / gridSize);
            ch = screenData[pos];
            if ((ch & 16) != 0) {
                screenData[pos] = (short) (ch & 15);
                score++;
            }
            if (pacman_x_dir != 0 || pacman_y_dir != 0) {
                if (!((pacman_x_dir == -1 && pacman_y_dir == 0 && (ch & 1) != 0) || (pacman_x_dir == 1 && pacman_y_dir == 0 && (ch & 4) != 0) || (pacman_x_dir == 0 && pacman_y_dir == -1 && (ch & 2) != 0) || (pacman_x_dir == 0 && pacman_y_dir == 1 && (ch & 8) != 0))) {
                    pacman_pre_x_dir = pacman_x_dir;
                    pacman_pre_y_dir = pacman_y_dir;    
                }
            }
            // Check for standstill
            if ((pacman_pre_x_dir == -1 && pacman_pre_y_dir == 0 && (ch & 1) != 0) || (pacman_pre_x_dir == 1 && pacman_pre_y_dir == 0 && (ch & 4) != 0) || (pacman_pre_x_dir == 0 && pacman_pre_y_dir == -1 && (ch & 2) != 0) || (pacman_pre_x_dir == 0 && pacman_pre_y_dir == 1 && (ch & 8) != 0)) {
                pacman_pre_x_dir = 0;
                pacman_pre_y_dir = 0;
            }
        }
        pacman_x = pacman_x + pacSpeed * pacman_pre_x_dir;
        pacman_y = pacman_y + pacSpeed * pacman_pre_y_dir;
    }
    //paint pacman image to board
    private void drawPacman(Graphics2D g2d) {
        g2d.drawImage(pacman_image, pacman_x, pacman_y, this);
    }
    //make board
    private void drawBoard(Graphics2D g2d) {
        short i = 0;
        int x, y;
        int x_pos,y_pos;
        //draw board matrix has value that determine if the grid has fiid or wall
        for (y = 0; y < blocks_y; y++) {
            for (x = 0; x < blocks_x; x++) {
                x_pos=x*gridSize;
                y_pos=y*gridSize;
                g2d.setColor(colorBoard);
                g2d.setStroke(new BasicStroke(2));
                //prints up left
                if ((screenData[i] & 1) != 0) { 
                    g2d.drawLine(x_pos, y_pos, x_pos, y_pos + gridSize - 1);
                }
                //prints up right
                if ((screenData[i] & 2) != 0) { 
                    g2d.drawLine(x_pos, y_pos, x_pos + gridSize - 1, y_pos);
                }
                //prints right up
                if ((screenData[i] & 4) != 0) { 
                    g2d.drawLine(x_pos + gridSize - 1, y_pos, x_pos + gridSize - 1,
                    y_pos + gridSize - 1);
                }
                //prints right down
                if ((screenData[i] & 8) != 0) { 
                    g2d.drawLine(x_pos, y_pos + gridSize - 1, x_pos + gridSize - 1,
                    y_pos + gridSize - 1);
                }
                //prints dots(foods)
                if ((screenData[i] & 16) != 0) { 
                    g2d.setColor(dotColor);
                    g2d.fillRect(x_pos + 11, y_pos + 11, 2, 2);
                }
                i++;
            }
            //System.out.println("a");
        }
    }
    //primary values when first started and show game during intro
    private void initGame() {
        pacsLeft = 3;
        score = 0;
        initilize_level();
        nGhost = 6;
        init_speed = 3;
    }

    //flattenning the 2d array to 1d array
    private void initilize_level() {
        int index=0;
        for (int i = 0; i <blocks_y; i++) {
            for(int j=0;j<blocks_x;j++){
                screenData[index] = BoardData[i][j];
                index++;
            }
        }
        continueLevel();
    }
    //ghosts andd pacman values for init game
    private void continueLevel() {
        short i;
        int dx = 1;
        int random;
        for (i = 0; i < nGhost; i++) {
            ghost_y[i] = 6 * gridSize;
            ghost_x[i] = 15 * gridSize;
            ghost_y_dir[i] = 0;
            ghost_x_dir[i] = dx;
            dx = -dx;
            random = (int) (Math.random() * (init_speed + 1));
            ghostSpeed[i] = speeds[random];
        }
        pacman_x = 8 * gridSize;
        pacman_y = 11 * gridSize;
        pacman_pre_x_dir = 0;
        pacman_pre_y_dir = 0;
        pacman_x_dir = 0;
        pacman_y_dir = 0;
        isdead = false;
    }
    //load images
    private void loadImages() {
        ghost_image = new ImageIcon("ghostBg.png").getImage();
        pacman_image = new ImageIcon("pacmanBg.png").getImage();
    }
    //to know 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
    //loop the game??
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, d.width, d.height);
        drawBoard(g2d);
        drawScore(g2d);
        if (isInGame) {
            playGame(g2d);
        } else {
            showIntro(g2d);
        }
        g2d.drawImage(ii, 5, 5, this);
    }
    //input
    class TAdapter extends KeyAdapter {
        @Override
        //check which direction or command key corrosponds to
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (isInGame) {
                if (key == KeyEvent.VK_LEFT) {
                    pacman_x_dir = -1;
                    pacman_y_dir = 0;
                } else if (key == KeyEvent.VK_RIGHT) {
                    pacman_x_dir = 1;
                    pacman_y_dir = 0;
                } else if (key == KeyEvent.VK_UP) {
                    pacman_x_dir = 0;
                    pacman_y_dir = -1;
                } else if (key == KeyEvent.VK_DOWN) {
                    pacman_x_dir = 0;
                    pacman_y_dir = 1;
                } else if (key == KeyEvent.VK_ESCAPE && timer.isRunning()) {
                    isInGame = false;
                } else if (key == KeyEvent.VK_PAUSE) {
                    if (timer.isRunning()) {
                        timer.stop();
                    } else {
                        timer.start();
                    }
                }
             //this is for begining to check if player wants to start the game
            } else {
                if (key == 's' || key == 'S') {
                    isInGame = true;
                    initGame();
                }
            }
        }
    }
    @Override
    //required due to implementation and to paint something on game window again
    public void actionPerformed(ActionEvent e) {
        //paint necxt frame??
        repaint();
    }
}