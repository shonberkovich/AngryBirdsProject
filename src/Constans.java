import javax.imageio.ImageIO;
import java.awt.*;

public class Constans {
    public static final int WINDOW_WIDTH=800;
    public static final int WINDOW_HIGHT=600;
    public static final int WINDOW_INSET=37;
    public static final int NUMBER_OF_BIRDS=4;
    public static final int HIGHT_CHARACTER=40;//30
    public static final int WIDTH_CHARACTER=40;//30
    public static final double GRAVITY_AMPLIFIER = 0.2;
    public static final int MAIN_LOOP_SLEEP = 20;
    public static final String PIG_IMAGE_PATH="resources/angryBirdsPigPic_transperent.png";

    public static final String BIRD_REGULAR_IMAGE_PATH="resources/angryBirdsMainBirdPic_transperent.png";
    public static final String BIRD_BOMB_IMAGE_PATH="resources/angryBirdsBomberBird_transperent.png";
    public static final String BACKROUND_OPENING_IMAGE_PATH= "resources/angryBirdsStartPage.png" ;//"resources/angryBirdsOpeneing.jpg";
    public static final String BACKROUND_INSTRUCTIONS_IMAGE_PATH="resources/angryBirdsInstructions.png";
    public static final String MAIN_SCENE_BACK_IMG="resources/angryBirdsGrassImages.png";

    public static final String TERREIN_GRASS_IMAGE="resources/grassNew_transperent.png";
    public static final String TERREIN_VERTIACL_LOG_IMAGE="resources/vertical_log.jpg";
    public static final String TERREIN_HORISONTAL_LOG_IMAGE="resources/horisontal_log.jpg";


    public static final String BACKGROUND_MUSIC_PATH="src/resources/AngryBirds-ThemeSong.wav";
    public static final String COLLISION_SOUND_PATH="src/resources/bird-impact-sound.wav";
    public static final String STERCH_SLING_SOUND_PATH="src/resources/Angry_Birds_Slingshot_Stretched_Sound_Effect.wav";




    public static final int PUT_BIRD_ON_SLIG_X=Constans.SLING_SHOT_LOCATION_X+Constans.SLING_SHOT_WIDTH/2 - Constans.WIDTH_CHARACTER/2;
    public static final int PUT_BIRD_ON_SLIG_Y=Constans.WINDOW_HIGHT-(Constans.SLING_SHOT_HIGHT+Constans.HIGHT_CHARACTER);
    public static final int MIN_TERRAIN_HIGHT=100;
    public static final int MAX_TERRAIN_HIGHT=400;//400
    public static final int NUMBER_OF_PILLERS=4;
    public static final int PILLER_WIDTH=30;
    public static final int SLING_SHOT_HIGHT=250;
    public static final int SLING_SHOT_WIDTH=35;
    public static final int SLING_SHOT_ARM_LENGTH=60;
    public static final int SLING_SHOT_ARM_WIDTH=20;
    public static final int SLING_SHOT_LOCATION_X=100;
    public static final int SLING_BASE_WIDTH=160;


    public static final int REST_BENCH_X=0;
    public static final int REST_BENCH_Y=(int) (Constans.HIGHT_CHARACTER*1.1);
    public static final int REST_BENCH_WIDTH=(int) (Constans.WIDTH_CHARACTER*4.5);
    public static final int REST_BENCH_HIGHT=Constans.HIGHT_CHARACTER/2;

    public static final String PLAY_BUTTON_TEXT ="play";
    public static final String PLAY_BUTTON_TEXT_FONT ="Algerian";
    public static final int PLAY_BUTTON_FONT_SIZE=50;






    public static final String INSTRUCTIONS_BUTTON_TEXT="instructions";
    public static final String INSTRUCTIONS_BUTTON_FONT="Algerian";
    public static final int INSTRUCTIONS_BUTTON_FONT_SIZE=40;
    public static final String EXIT_BUTTON_TEXT="exit";
    public static final int OPENINIG_SCREEN_PLAY_BUTTON_X=250;
    public static final int OPENINIG_SCREEN_PLAY_BUTTON_Y=200;
    public static final int OPENINIG_SCREEN_INSTRUCTIONS_BUTTON_X=250;
    public static final int OPENINIG_SCREEN_INSTRUCTIONS_BUTTON_Y=330;
    public static final int OPENINIG_SCREEN_BOTH_BUTTON_WIDTH=300;
    public static final int OPENINIG_SCREEN_BOTH_BUTTON_HIGHT=100;
    public static final int EXIT_BUTTON_X=725;
    public static final int EXIT_BUTTON_Y=0;
    public static final int EXIT_BUTTON_WIDTH=75;
    public static final int EXIT_BUTTON_HIGHT=30;
    public static final String LOST_BUTTON_TEXT="<html>you lost<br> try again</html>";
    public static final int LOST_BUTTON_X=WINDOW_WIDTH/2 - 150;
    public static final int LOST_BUTTON_Y=WINDOW_HIGHT/2 - 150;
    public static final int LOST_BUTTON_WIDTH=300;
    public static final int LOST_BUTTON_HIGHT=300;
    public static final int LOST_BUTTON_FONT_SIZE=40;
    public static final String EXIT_BUTTON_TEXT_FONT_NAME ="Tahoma";
    public static final int EXIT_BUTTON_FONT=Font.BOLD;
    public static final int EXIT_BUTTON_FONT_SIZE=20;



    public static final String SCORE_LABEL_TEXT="SCORE : 0 ";
    public static final int SCORE_LABEL_X=600;
    public static final int SCORE_LABEL_Y=0;
    public static final int SCORE_LABEL_WIDTH=150;
    public static final int SCORE_LABEL_HIGHT=30;
    public static final String SCORE_LABEL_FONT_NAME="Arial";
    public static final int SCORE_LABEL_FONT=Font.BOLD;
    public static final int SCORE_LABEL_FONT_SIZE=20;
    public static final Color SCORE_LABEL_COLOR=Color.black;


    public static final int INSTRUCTIONS_LABEL_X=50;
    public static final int INSTRUCTIONS_LABEL_Y=0;
    public static final int INSTRUCTIONS_LABEL_WIDTH=700;
    public static final int INSTRUCTIONS_LABEL_HIGHT=500 ;
    public static final String INSTRUCTIONS_LABEL_FONT_NAME="Tahoma";
    public static final int INSTRUCTIONS_LABEL_FONT=Font.BOLD;
    public static final int INSTRUCTIONS_LABEL_FONT_SIZE=25;
    public static final Color INSTRUCTIONS_LABEL_COLOR=Color.black;








}


