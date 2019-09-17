package creater.abstractfactory;/**
 * Created by Administrator on 2019/9/17.
 */


import creater.abstractfactory.factory.CommonMazeFactory;
import creater.abstractfactory.factory.InterestingMazeFactory;
import creater.abstractfactory.factory.MazeFactory;
import creater.abstractfactory.room.Room;

import java.util.List;

import static creater.abstractfactory.Direction.*;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName MazeGame
 * @Description 迷宫游戏 - 只有创建迷宫的方法
 * @Date 2019/9/17 15:52
 **/
public class MazeGame {
    // 创建一个普通的迷宫
    public Maze createMaze(){
        MazeFactory mazeFactory = new CommonMazeFactory();
        Maze result = new Maze();
        List<Room> rooms = result.getRooms();

        Room r1 = mazeFactory.creatRoom();
        r1.setRoomNo(1);
        r1.setSites(West,mazeFactory.createWall());
        r1.setSites(South,mazeFactory.createWall());
        r1.setSites(East,mazeFactory.createWall());
        r1.setSites(North,mazeFactory.createDoor());
        // 普通的房子 - 1
        rooms.add(r1);

        Room r2 = mazeFactory.creatRoom();
        r2.setRoomNo(1);
        r2.setSites(West,mazeFactory.createWall());
        r2.setSites(South,mazeFactory.createWall());
        r2.setSites(East,mazeFactory.createWall());
        r2.setSites(North,mazeFactory.createDoor());

        // 普通的房子 - 2
        rooms.add(r2);
        // 返回迷宫
        return result;
    }

    // 创建一个有炸弹还能 b-box 的迷宫
    public Maze createMaze1(){
        // 仅修改以下一行代码（为了便于整体展示，没有优化代码）
        MazeFactory mazeFactory = new InterestingMazeFactory();
        Maze result = new Maze();
        List<Room> rooms = result.getRooms();

        Room r1 = mazeFactory.creatRoom();
        r1.setRoomNo(1);
        r1.setSites(West,mazeFactory.createWall());
        r1.setSites(South,mazeFactory.createWall());
        r1.setSites(East,mazeFactory.createWall());
        r1.setSites(North,mazeFactory.createDoor());
        // 有炸弹的房子且进门需要 b-box - 1
        rooms.add(r1);

        Room r2 = mazeFactory.creatRoom();
        r2.setRoomNo(1);
        r2.setSites(West,mazeFactory.createWall());
        r2.setSites(South,mazeFactory.createWall());
        r2.setSites(East,mazeFactory.createWall());
        r2.setSites(North,mazeFactory.createDoor());

        // 有炸弹的房子且进门需要 b-box - 2
        rooms.add(r2);
        // 返回迷宫
        return result;
    }


    public static void main(String[] args) {
        MazeGame game = new MazeGame();

        Maze commomMaze = game.createMaze();
        Maze interestingMaze = game.createMaze1();

        commomMaze.showMaze();
        System.out.println("\n\n\n\n");
        interestingMaze.showMaze();
    }
}
