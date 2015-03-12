package com.lim.darts;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;



public class Darts extends ActionBarActivity {

    Button p11501button;
    Button p11502button;
    Button p11503button;
    Button p21501button;
    Button p21502button;
    Button p21503button;

    Button p11601button;
    Button p11602button;
    Button p11603button;
    Button p21601button;
    Button p21602button;
    Button p21603button;

    Button p11701button;
    Button p11702button;
    Button p11703button;
    Button p21701button;
    Button p21702button;
    Button p21703button;

    Button p11801button;
    Button p11802button;
    Button p11803button;
    Button p21801button;
    Button p21802button;
    Button p21803button;

    Button p11901button;
    Button p11902button;
    Button p11903button;
    Button p21901button;
    Button p21902button;
    Button p21903button;

    Button p12001button;
    Button p12002button;
    Button p12003button;
    Button p22001button;
    Button p22002button;
    Button p22003button;

    Button p12501button;
    Button p12502button;
    Button p22501button;
    Button p22502button;

    ImageView p115ImageView;
    ImageView p215ImageView;
    ImageView p116ImageView;
    ImageView p216ImageView;
    ImageView p117ImageView;
    ImageView p217ImageView;
    ImageView p118ImageView;
    ImageView p218ImageView;
    ImageView p119ImageView;
    ImageView p219ImageView;
    ImageView p120ImageView;
    ImageView p220ImageView;

    ImageView p125ImageView;
    ImageView p225ImageView;

    TextView p1ScoreTextView;
    TextView p2ScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darts);
        getSupportActionBar().hide();

        p11501button = (Button) findViewById(R.id.p11501button);
        p11501button.setTag("011501");
        p11502button = (Button) findViewById(R.id.p11502button);
        p11502button.setTag("011502");
        p11503button = (Button) findViewById(R.id.p11503button);
        p11503button.setTag("011503");
        p21501button = (Button) findViewById(R.id.p21501button);
        p21501button.setTag("021501");
        p21502button = (Button) findViewById(R.id.p21502button);
        p21502button.setTag("021502");
        p21503button = (Button) findViewById(R.id.p21503button);
        p21503button.setTag("021503");

        p11601button = (Button) findViewById(R.id.p11601button);
        p11601button.setTag("011601");
        p11602button = (Button) findViewById(R.id.p11602button);
        p11602button.setTag("011602");
        p11603button = (Button) findViewById(R.id.p11603button);
        p11603button.setTag("011603");
        p21601button = (Button) findViewById(R.id.p21601button);
        p21601button.setTag("021601");
        p21602button = (Button) findViewById(R.id.p21602button);
        p21602button.setTag("021602");
        p21603button = (Button) findViewById(R.id.p21603button);
        p21603button.setTag("021603");

        p11701button = (Button) findViewById(R.id.p11701button);
        p11701button.setTag("011701");
        p11702button = (Button) findViewById(R.id.p11702button);
        p11702button.setTag("011702");
        p11703button = (Button) findViewById(R.id.p11703button);
        p11703button.setTag("011703");
        p21701button = (Button) findViewById(R.id.p21701button);
        p21701button.setTag("021701");
        p21702button = (Button) findViewById(R.id.p21702button);
        p21702button.setTag("021702");
        p21703button = (Button) findViewById(R.id.p21703button);
        p21703button.setTag("021703");

        p11801button = (Button) findViewById(R.id.p11801button);
        p11801button.setTag("011801");
        p11802button = (Button) findViewById(R.id.p11802button);
        p11802button.setTag("011802");
        p11803button = (Button) findViewById(R.id.p11803button);
        p11803button.setTag("011803");
        p21801button = (Button) findViewById(R.id.p21801button);
        p21801button.setTag("021801");
        p21802button = (Button) findViewById(R.id.p21802button);
        p21802button.setTag("021802");
        p21803button = (Button) findViewById(R.id.p21803button);
        p21803button.setTag("021803");

        p11901button = (Button) findViewById(R.id.p11901button);
        p11901button.setTag("011901");
        p11902button = (Button) findViewById(R.id.p11902button);
        p11902button.setTag("011902");
        p11903button = (Button) findViewById(R.id.p11903button);
        p11903button.setTag("011903");
        p21901button = (Button) findViewById(R.id.p21901button);
        p21901button.setTag("021901");
        p21902button = (Button) findViewById(R.id.p21902button);
        p21902button.setTag("021902");
        p21903button = (Button) findViewById(R.id.p21903button);
        p21903button.setTag("021903");

        p12001button = (Button) findViewById(R.id.p12001button);
        p12001button.setTag("012001");
        p12002button = (Button) findViewById(R.id.p12002button);
        p12002button.setTag("012002");
        p12003button = (Button) findViewById(R.id.p12003button);
        p12003button.setTag("012003");
        p22001button = (Button) findViewById(R.id.p22001button);
        p22001button.setTag("022001");
        p22002button = (Button) findViewById(R.id.p22002button);
        p22002button.setTag("022002");
        p22003button = (Button) findViewById(R.id.p22003button);
        p22003button.setTag("022003");

        p12501button = (Button) findViewById(R.id.p12501button);
        p12501button.setTag("012501");
        p12502button = (Button) findViewById(R.id.p12502button);
        p12502button.setTag("012502");
        p22501button = (Button) findViewById(R.id.p22501button);
        p22501button.setTag("022501");
        p22502button = (Button) findViewById(R.id.p22502button);
        p22502button.setTag("022502");

        p115ImageView = (ImageView) findViewById(R.id.p115ImageView);
        p115ImageView.setTag("011500");
        p215ImageView = (ImageView) findViewById(R.id.p215ImageView);
        p215ImageView.setTag("021500");
        p116ImageView = (ImageView) findViewById(R.id.p116ImageView);
        p116ImageView.setTag("011600");
        p216ImageView = (ImageView) findViewById(R.id.p216ImageView);
        p216ImageView.setTag("021600");
        p117ImageView = (ImageView) findViewById(R.id.p117ImageView);
        p117ImageView.setTag("011700");
        p217ImageView = (ImageView) findViewById(R.id.p217ImageView);
        p217ImageView.setTag("021700");
        p118ImageView = (ImageView) findViewById(R.id.p118ImageView);
        p118ImageView.setTag("011800");
        p218ImageView = (ImageView) findViewById(R.id.p218ImageView);
        p218ImageView.setTag("021800");
        p119ImageView = (ImageView) findViewById(R.id.p119ImageView);
        p119ImageView.setTag("011900");
        p219ImageView = (ImageView) findViewById(R.id.p219ImageView);
        p219ImageView.setTag("021900");
        p120ImageView = (ImageView) findViewById(R.id.p120ImageView);
        p120ImageView.setTag("012000");
        p220ImageView = (ImageView) findViewById(R.id.p220ImageView);
        p220ImageView.setTag("022000");
        p125ImageView = (ImageView) findViewById(R.id.p125ImageView);
        p125ImageView.setTag("012500");
        p225ImageView = (ImageView) findViewById(R.id.p225ImageView);
        p225ImageView.setTag("022500");

        p1ScoreTextView = (TextView) findViewById(R.id.p1ScoreTextView);
        p2ScoreTextView = (TextView) findViewById(R.id.p2ScoreTextView);

    }
    public void reset(View v){

        AlertDialog.Builder quitDialog = new AlertDialog.Builder(Darts.this);
        quitDialog.setTitle("Start New Game?");

        quitDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

        quitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        quitDialog.show();
    }

    public void increment(View v){

        ImageView aImageView = (ImageView) findViewById(v.getId());

        String player = aImageView.getTag().toString().substring(0,2);
        String number = aImageView.getTag().toString().substring(2,4);
        String status = aImageView.getTag().toString().substring(4,6);

        switch (status){
            case("00"):
                aImageView.setImageResource(R.drawable.ic_001);
                status = "01";
                aImageView.setTag(player + number + status);
                break;
            case("01"):
                aImageView.setImageResource(R.drawable.ic_002);
                status = "02";
                aImageView.setTag(player + number + status);
                break;
            case("02"):
                aImageView.setImageResource(R.drawable.ic_003);
                status = "03";
                aImageView.setTag(player + number + status);
                if(!checkGameOver(player)){
                    enableScoring(player, number);
                }else{
                    endGame();
                }
                break;
            default:

                break;
        }
    }

    public boolean checkGameOver(String player){
        boolean gameover = false;

        switch(player){
            case ("01"):
                if(p115ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p116ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p117ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p118ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p119ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p120ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p125ImageView.getTag().toString().substring(4,6).equals("03"))
                {
                   gameover = true;
                }
                break;
            case("02"):
                if(p215ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p216ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p217ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p218ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p219ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p220ImageView.getTag().toString().substring(4,6).equals("03")&&
                        p225ImageView.getTag().toString().substring(4,6).equals("03"))
                {
                    gameover = true;
                }
                break;
        }
        return gameover;
    }

    public void endGame(){
        int p1Score;
        int p2Score;
        String title= "";
        String message="";
        String [] playerArray = {"01", "02"};
        String [] numberArray = {"15","16","17","18","19","20","25"};
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(Darts.this);

        for(int i=0; i<playerArray.length; i++){
            for(int j=0;j<numberArray.length;j++){
                disableScoring(playerArray[i], numberArray[j]);
            }
        }

        p1Score = Integer.parseInt(p1ScoreTextView.getText().toString());
        p2Score = Integer.parseInt(p2ScoreTextView.getText().toString());

        if(p1Score>p2Score){
            title = "Player 1 Wins!";
        }else{
            title = "Player 2 Wins!";
        }

        message = "Player 1 Score: " + p1Score + "\nPlayer 2 Score: " + p2Score;

        quitDialog.setTitle(title);
        quitDialog.setMessage(message);
        quitDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

        quitDialog.show();

    }

    private void disableScoring(String player, String number){

        switch (number) {
            case ("15"):
                switch (player) {
                    case ("01"):
                        p11501button.setVisibility(View.INVISIBLE);
                        p11502button.setVisibility(View.INVISIBLE);
                        p11503button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p21501button.setVisibility(View.INVISIBLE);
                        p21502button.setVisibility(View.INVISIBLE);
                        p21503button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
            case ("16"):
                switch (player) {
                    case ("01"):
                        p11601button.setVisibility(View.INVISIBLE);
                        p11602button.setVisibility(View.INVISIBLE);
                        p11603button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p21601button.setVisibility(View.INVISIBLE);
                        p21602button.setVisibility(View.INVISIBLE);
                        p21603button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
            case ("17"):
                switch (player) {
                    case ("01"):
                        p11701button.setVisibility(View.INVISIBLE);
                        p11702button.setVisibility(View.INVISIBLE);
                        p11703button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p21701button.setVisibility(View.INVISIBLE);
                        p21702button.setVisibility(View.INVISIBLE);
                        p21703button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
            case ("18"):
                switch (player) {
                    case ("01"):
                        p11801button.setVisibility(View.INVISIBLE);
                        p11802button.setVisibility(View.INVISIBLE);
                        p11803button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p21801button.setVisibility(View.INVISIBLE);
                        p21802button.setVisibility(View.INVISIBLE);
                        p21803button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
            case ("19"):
                switch (player) {
                    case ("01"):
                        p11901button.setVisibility(View.INVISIBLE);
                        p11902button.setVisibility(View.INVISIBLE);
                        p11903button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p21901button.setVisibility(View.INVISIBLE);
                        p21902button.setVisibility(View.INVISIBLE);
                        p21903button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
            case ("20"):
                switch (player) {
                    case ("01"):
                        p12001button.setVisibility(View.INVISIBLE);
                        p12002button.setVisibility(View.INVISIBLE);
                        p12003button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p22001button.setVisibility(View.INVISIBLE);
                        p22002button.setVisibility(View.INVISIBLE);
                        p22003button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
            case ("25"):
                switch (player) {
                    case ("01"):
                        p12501button.setVisibility(View.INVISIBLE);
                        p12502button.setVisibility(View.INVISIBLE);
                        break;
                    case ("02"):
                        p22501button.setVisibility(View.INVISIBLE);
                        p22502button.setVisibility(View.INVISIBLE);
                        break;
                }
                break;
        }
    }

    private void enableScoring(String player, String number){

        switch (number){
            case("15"):
                switch(player){
                    case("01"):
                        if(!p215ImageView.getTag().toString().substring(4,6).equals("03")){
                            p11501button.setVisibility(View.VISIBLE);
                            p11502button.setVisibility(View.VISIBLE);
                            p11503button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p115ImageView.getTag().toString().substring(4,6).equals("03")){
                            p21501button.setVisibility(View.VISIBLE);
                            p21502button.setVisibility(View.VISIBLE);
                            p21503button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01", number);
                        }
                        break;
                }
                break;
            case("16"):
                switch(player){
                    case("01"):
                        if(!p216ImageView.getTag().toString().substring(4,6).equals("03")){
                            p11601button.setVisibility(View.VISIBLE);
                            p11602button.setVisibility(View.VISIBLE);
                            p11603button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p116ImageView.getTag().toString().substring(4,6).equals("03")){
                            p21601button.setVisibility(View.VISIBLE);
                            p21602button.setVisibility(View.VISIBLE);
                            p21603button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01", number);
                        }
                        break;
                }
                break;
            case("17"):
                switch(player){
                    case("01"):
                        if(!p217ImageView.getTag().toString().substring(4,6).equals("03")){
                            p11701button.setVisibility(View.VISIBLE);
                            p11702button.setVisibility(View.VISIBLE);
                            p11703button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p117ImageView.getTag().toString().substring(4,6).equals("03")){
                            p21701button.setVisibility(View.VISIBLE);
                            p21702button.setVisibility(View.VISIBLE);
                            p21703button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01", number);
                        }
                        break;
                }
                break;
            case("18"):
                switch(player){
                    case("01"):
                        if(!p218ImageView.getTag().toString().substring(4,6).equals("03")){
                            p11801button.setVisibility(View.VISIBLE);
                            p11802button.setVisibility(View.VISIBLE);
                            p11803button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p118ImageView.getTag().toString().substring(4,6).equals("03")){
                            p21801button.setVisibility(View.VISIBLE);
                            p21802button.setVisibility(View.VISIBLE);
                            p21803button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01", number);
                        }
                        break;
                }
                break;
            case("19"):
                switch(player){
                    case("01"):
                        if(!p219ImageView.getTag().toString().substring(4,6).equals("03")){
                            p11901button.setVisibility(View.VISIBLE);
                            p11902button.setVisibility(View.VISIBLE);
                            p11903button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p119ImageView.getTag().toString().substring(4,6).equals("03")){
                            p21901button.setVisibility(View.VISIBLE);
                            p21902button.setVisibility(View.VISIBLE);
                            p21903button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01", number);
                        }
                        break;
                }
                break;
            case("20"):
                switch(player){
                    case("01"):
                        if(!p220ImageView.getTag().toString().substring(4,6).equals("03")){
                            p12001button.setVisibility(View.VISIBLE);
                            p12002button.setVisibility(View.VISIBLE);
                            p12003button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p120ImageView.getTag().toString().substring(4,6).equals("03")){
                            p22001button.setVisibility(View.VISIBLE);
                            p22002button.setVisibility(View.VISIBLE);
                            p22003button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01", number);
                        }
                        break;
                }
                break;
            case("25"):
                switch(player){
                    case("01"):
                        if(!p225ImageView.getTag().toString().substring(4,6).equals("03")){
                            p12501button.setVisibility(View.VISIBLE);
                            p12502button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("02", number);
                        }
                        break;
                    case("02"):
                        if(!p125ImageView.getTag().toString().substring(4,6).equals("03")){
                            p22501button.setVisibility(View.VISIBLE);
                            p22502button.setVisibility(View.VISIBLE);
                        }else{
                            disableScoring("01 ", number);
                        }
                        break;
                }
                break;
        }
    }

    public void addScore(View v){

        Button aButton = (Button) findViewById(v.getId());

        String player = aButton.getTag().toString().substring(0, 2);
        String number = aButton.getTag().toString().substring(2, 4);
        String multip = aButton.getTag().toString().substring(4, 6);
        String message = "";
        int addScore = (Integer.parseInt(number) * Integer.parseInt(multip));
        int currScore;

        switch(player){
            case("01"):
                TextView p1ScoreTextView = (TextView) findViewById(R.id.p1ScoreTextView);
                currScore = Integer.parseInt(p1ScoreTextView.getText().toString());
                p1ScoreTextView.setText(String.format("%04d", (currScore + addScore)));

                message = "Player 1\n+" + String.valueOf(addScore);

                break;
            case("02"):
                TextView p2ScoreTextView = (TextView) findViewById(R.id.p2ScoreTextView);
                currScore = Integer.parseInt(p2ScoreTextView.getText().toString());
                p2ScoreTextView.setText(String.format("%04d", (currScore + addScore)));
                message = "Player 2\n+" + String.valueOf(addScore);
                break;
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }
}
