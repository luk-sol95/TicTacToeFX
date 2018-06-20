package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public TicTacToeLogic ticTacToeLogic = new TicTacToeLogic(1);
    public Button tictac20 = new Button();
    public Button tictac10 = new Button();
    public Button tictac00 = new Button();
    public Button tictac11 = new Button();
    public Button tictac12 = new Button();
    public Button tictac21 = new Button();
    public Button tictac22 = new Button();
    public Button tictac02 = new Button();
    public Button tictac01 = new Button();
    public Label winLabel = new Label();
    public Label currentPlayerLabel = new Label();

    public void ticTac00Click() {
        ticTacToeLogic.move(0, 0);
        tictac00.setText(ticTacToeLogic.getSign(0, 0));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();

    }

    public void ticTac01Click() {
        ticTacToeLogic.move(0, 1);
        tictac01.setText(ticTacToeLogic.getSign(0, 1));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac02Click() {
        ticTacToeLogic.move(0, 2);
        tictac02.setText(ticTacToeLogic.getSign(0, 2));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac10Click() {
        ticTacToeLogic.move(1, 0);
        tictac10.setText(ticTacToeLogic.getSign(1, 0));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac11Click() {
        ticTacToeLogic.move(1, 1);
        tictac11.setText(ticTacToeLogic.getSign(1, 1));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac12Click() {
        ticTacToeLogic.move(1, 2);
        tictac12.setText(ticTacToeLogic.getSign(1, 2));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac20Click() {
        ticTacToeLogic.move(2, 0);
        tictac20.setText(ticTacToeLogic.getSign(2, 0));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac21Click() {
        ticTacToeLogic.move(2, 1);
        tictac21.setText(ticTacToeLogic.getSign(2, 1));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void ticTac22Click() {
        ticTacToeLogic.move(2, 2);
        tictac22.setText(ticTacToeLogic.getSign(2, 2));
        if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW || ticTacToeLogic.isFinished() == 'X' || ticTacToeLogic.isFinished() == 'O') {
            finished();
        }
        currentPlayerDisplay();
    }

    public void finished () {
        tictac00.setDisable(true);
        tictac01.setDisable(true);
        tictac02.setDisable(true);
        tictac10.setDisable(true);
        tictac11.setDisable(true);
        tictac12.setDisable(true);
        tictac20.setDisable(true);
        tictac21.setDisable(true);
        tictac22.setDisable(true);
        currentPlayerLabel.setText(" ");

        if (ticTacToeLogic.isFinished() == 'X') {
            winLabel.setText("X won!");
        } else if (ticTacToeLogic.isFinished() == 'O') {
            winLabel.setText("O won!");
        } else if (ticTacToeLogic.isFinished() == TicTacToeLogic.DRAW) {
            winLabel.setText("It's a draw!");
        }


    }


    public void resetGame (){
        resetButton(tictac00);
        resetButton(tictac01);
        resetButton(tictac02);
        resetButton(tictac10);
        resetButton(tictac11);
        resetButton(tictac12);
        resetButton(tictac20);
        resetButton(tictac21);
        resetButton(tictac22);
        winLabel.setText("");
        ticTacToeLogic.reset();


    }
    public void resetButton (Button button) {
        button.setDisable(false);
        button.setText("");
    }

    public void currentPlayerDisplay() {
        if (ticTacToeLogic.getCurrentPlayer() == 1) {
            currentPlayerLabel.setText("now X turn");
        } else {
            currentPlayerLabel.setText("now O turn");
        }
    }

}
