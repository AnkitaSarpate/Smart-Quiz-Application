package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import java.util.Collections;
import javafx.animation.PauseTransition;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.image.Image;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

public class Main extends Application {

	private static final int WIDTH = 900;
	private static final int HEIGHT = 600;
	private static final String PRIMARY_COLOR = "#7B3FA1";
	private static final String BUTTON_COLOR = "#8E2F8A";
	private Map<String, Integer> unlockedLevels = new HashMap<>();
	private String currentUser;
	private List<ScoreRecord> leaderboard = new ArrayList<>();
	private static final String VALID_USERNAME = "AnkitaSarpate";
	private static final String VALID_PASSWORD = "0826";
	private static final String LEADERBOARD_FILE = "leaderboard.txt";
	private static final String PROGRESS_FILE = "progress.txt";
	
	@Override
	public void start(Stage stage) {
		
		loadLeaderboardFromFile();
		loadProgressFromFile();
		
		stage.setTitle("Smart Quiz Application - Developed by [Ankita Sarpate]");
		stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
		stage.setMinWidth(900);
		stage.setMinHeight(600);
		
		stage.setScene(createLoginScene(stage));
		stage.show();
		stage.setOnCloseRequest(event -> {

		    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		    alert.setTitle("Exit Confirmation");
		    alert.setHeaderText(null);
		    alert.setContentText("Do you want to exit Smart Quiz Application?");

		    ButtonType yesButton = new ButtonType("Yes");
		    ButtonType noButton = new ButtonType("No");

		    alert.getButtonTypes().setAll(yesButton, noButton);

		    Optional<ButtonType> result = alert.showAndWait();

		    if (result.isPresent() && result.get() == yesButton) {
		        System.exit(0);
		    } else {
		        event.consume();  // Stay in application
		    }
		});
	}
		// =========================
		// PAGE 1 : WELCOME PAGE
		// =========================

	private Scene createWelcomeScene(Stage stage) {

	    VBox root = new VBox(60);
	    root.setAlignment(Pos.CENTER);
	    root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

	    Label title = new Label("WELCOME TO\nSMART QUIZ APPLICATION");
	    title.setFont(new Font("Times New Roman", 36));
	    title.setTextFill(Color.WHITE);
	    title.setTextAlignment(TextAlignment.CENTER);

	    Button startButton = createWhiteButton("START");
	    startButton.setOnAction(e ->
	            stage.setScene(createSubjectScene(stage))
	    );

	    root.getChildren().addAll(title, startButton);

	    applyFadeTransition(root);

	    return new Scene(root, WIDTH, HEIGHT);
	}
	// =========================
	// PAGE 2 : SUBJECT PAGE
	// =========================
	private Scene createSubjectScene(Stage stage) {

		StackPane root = new StackPane();
		root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

		VBox whiteBox = new VBox(25);
		whiteBox.setAlignment(Pos.CENTER);
		whiteBox.setMaxWidth(500);
		whiteBox.setPrefWidth(500);
		whiteBox.setMaxHeight(Region.USE_PREF_SIZE);
		whiteBox.setPrefHeight(Region.USE_COMPUTED_SIZE);
		whiteBox.setStyle(
			    "-fx-background-color: white;" +
			    "-fx-padding: 40;" +
			    "-fx-background-radius: 25;" +
			    "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 15, 0, 0, 5);"
			);
		StackPane.setAlignment(whiteBox, Pos.CENTER);
		
		Label title = new Label("SELECT SUBJECTS");
		title.setFont(new Font("Times New Roman", 26));
		title.setStyle("-fx-font-weight: bold;");

		Button pythonBtn = createPurpleButton("PYTHON");
		pythonBtn.setOnAction(e -> stage.setScene(createDifficultyScene(stage, "PYTHON")));

		Button javaBtn = createPurpleButton("JAVA");
		javaBtn.setOnAction(e -> stage.setScene(createDifficultyScene(stage, "JAVA")));

		Button gkBtn = createPurpleButton("GENERAL KNOWLEDGE");
		gkBtn.setOnAction(e -> stage.setScene(createDifficultyScene(stage, "GENERAL KNOWLEDGE")));

		Button entBtn = createPurpleButton("ENTERTAINMENT");
		entBtn.setOnAction(e -> stage.setScene(createDifficultyScene(stage, "ENTERTAINMENT")));

		Button leaderboardBtn = createPurpleButton("VIEW LEADERBOARD");
		leaderboardBtn.setOnAction(e ->
		        stage.setScene(createLeaderboardScene(stage))
		);
		
		whiteBox.getChildren().addAll(
		        title,
		        pythonBtn,
		        javaBtn,
		        gkBtn,
		        entBtn,
		        leaderboardBtn
		);

		root.getChildren().add(whiteBox);


		Button logoutBtn = createLogoutButton(stage);
		StackPane.setAlignment(logoutBtn, Pos.TOP_RIGHT);
		StackPane.setMargin(logoutBtn, new Insets(20));
		root.getChildren().add(logoutBtn);
		
		applyFadeTransition(root);
		return new Scene(root, WIDTH, HEIGHT);
	}

	// =========================
	// COMMON BUTTON STYLE
	// =========================
	private Button createPurpleButton(String text) {

	    Button btn = new Button(text);

	    btn.setPrefWidth(250);
	    btn.setPrefHeight(45);

	    btn.setStyle(
	            "-fx-background-color: " + BUTTON_COLOR + ";" +
	            "-fx-text-fill: white;" +
	            "-fx-font-size: 14px;" +
	            "-fx-background-radius: 20;"
	    );

	    return btn;
	}

	private void handleAnswerClick(int selectedIndex, Question currentQuestion, Button optionA, Button optionB,
			Button optionC, Button optionD, int[] score) {
		Button[] buttons = { optionA, optionB, optionC, optionD };

		int correctIndex = currentQuestion.getCorrectAnswerIndex();

		// Disable all buttons
		for (Button btn : buttons) {
			btn.setDisable(true);
		}

		// Highlight correct answer (green)
		buttons[correctIndex].setStyle("-fx-background-color: #2ECC71;" + "-fx-text-fill: white;"
				+ "-fx-font-size: 16px;" + "-fx-padding: 10 30 10 30;" + "-fx-background-radius: 10;");

		// If wrong answer selected, mark red
		if (selectedIndex != correctIndex) {
			buttons[selectedIndex].setStyle("-fx-background-color: #E74C3C;" + "-fx-text-fill: white;"
					+ "-fx-font-size: 16px;" + "-fx-padding: 10 30 10 30;" + "-fx-background-radius: 10;");
		} else {
			score[0]++;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

//=========================
//PAGE 3 : DIFFICULTY PAGE
//=========================
	private Scene createDifficultyScene(Stage stage, String subject) {

		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

		// Main white box
		VBox whiteBox = new VBox(20);
		whiteBox.setMaxWidth(650);
		whiteBox.setStyle("-fx-background-color: white;" + "-fx-padding: 40;" + "-fx-background-radius: 40;");

		// ---------------- TOP BAR ----------------
		HBox topBar = new HBox(15);
		topBar.setAlignment(Pos.CENTER_LEFT);

		Button backBtn = new Button("←");
		backBtn.setStyle(
		        "-fx-background-color: transparent;" +
		        "-fx-text-fill: #2C3E50;" +
		        "-fx-font-size: 28px;" +
		        "-fx-font-weight: bold;"
		);
		backBtn.setOnAction(e -> stage.setScene(createSubjectScene(stage)));

		Label subjectLabel = new Label(subject);
		subjectLabel.setFont(new Font("Times New Roman", 24));
		subjectLabel.setTextFill(Color.BLACK);

		topBar.getChildren().addAll(backBtn, subjectLabel);

		// ---------------- CENTER CONTENT ----------------
		VBox contentBox = new VBox(20);
		contentBox.setAlignment(Pos.CENTER);

		Label title = new Label("SELECT DIFFICULTY");
		title.setFont(new Font("Times New Roman", 26));
		title.setStyle("-fx-font-weight: bold;");
		
		Button easyBtn = createPurpleButton("EASY");
		Button mediumBtn = createPurpleButton("MEDIUM");
		Button hardBtn = createPurpleButton("HARD");

		easyBtn.setOnAction(e -> stage.setScene(createLevelScene(stage, subject, "EASY")));

		mediumBtn.setOnAction(e -> stage.setScene(createLevelScene(stage, subject, "MEDIUM")));

		hardBtn.setOnAction(e -> stage.setScene(createLevelScene(stage, subject, "HARD")));

		contentBox.getChildren().addAll(title, easyBtn, mediumBtn, hardBtn);

		// ---------------- ADD TO WHITE BOX ----------------
		whiteBox.getChildren().addAll(topBar, contentBox);

		root.getChildren().add(whiteBox);

		applyFadeTransition(root);
		return new Scene(root, WIDTH, HEIGHT);
	}

//=========================
//PAGE 4 : LEVEL SELECTION
//=========================
	private Scene createLevelScene(Stage stage, String subject, String difficulty) {

		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");
		root.setPadding(new Insets(40));

		VBox whiteBox = new VBox(15);
		whiteBox.setMaxWidth(650);
		whiteBox.setMaxHeight(480);
		whiteBox.setAlignment(Pos.TOP_CENTER);
		whiteBox.setStyle("-fx-background-color: white;" + "-fx-padding: 25;" + "-fx-background-radius: 40;");

		// ---------- HEADER ----------
		HBox header = new HBox(15);
		header.setAlignment(Pos.CENTER_LEFT);

		Button backBtn = new Button("←");
		backBtn.setStyle(
		        "-fx-background-color: transparent;" +
		        "-fx-text-fill: #2C3E50;" +
		        "-fx-font-size: 28px;" +
		        "-fx-font-weight: bold;"
		);

		backBtn.setOnAction(e -> {
			stage.setScene(createDifficultyScene(stage, subject));
		});

		Label subjectLabel = new Label(subject + " - " + difficulty);
		subjectLabel.setFont(new Font("Times New Roman", 24));

		header.getChildren().addAll(backBtn, subjectLabel);

		// ---------- TITLE ----------
		Label title = new Label("SELECT LEVEL");
		title.setFont(new Font("Times New Roman", 26));
		title.setStyle("-fx-font-weight: bold;");
		
		// ---------- LEVEL BUTTONS ----------
		VBox levelBox = new VBox(8);
		levelBox.setAlignment(Pos.CENTER);
		for (int i = 1; i <= 10; i++) {

			final int levelNumber = i; // ✅ THIS FIXES THE ERROR

			Button levelBtn = createPurpleButton("LEVEL " + i);

			String key = subject + "_" + difficulty;
			int unlockedUpto = unlockedLevels.getOrDefault(key, 1);

			if (i <= unlockedUpto) {
				levelBtn.setText("LEVEL " + i + " ⭐");
				// FORCE purple style for unlocked levels
				levelBtn.setDisable(false);
				levelBtn.setStyle("-fx-background-color: #8E2F8A;" + "-fx-text-fill: white;" + "-fx-font-size: 16px;"
						+ "-fx-font-weight: bold;" + "-fx-padding: 10 30 10 30;" + "-fx-background-radius: 15;");

				levelBtn.setOnAction(e -> stage.setScene(createQuizScene(stage, subject, difficulty, levelNumber)));

			} else {

				levelBtn.setDisable(true);

				levelBtn.setText("LEVEL " + i + " 🔒");

				levelBtn.setStyle("-fx-background-color: #E0E0E0;" + "-fx-text-fill: #888888;" + "-fx-font-size: 16px;"
						+ "-fx-padding: 10 30 10 30;" + "-fx-background-radius: 15;");
			}
			levelBox.getChildren().add(levelBtn);
		}

		// ---------- SCROLL ----------
		ScrollPane scrollPane = new ScrollPane(levelBox);
		scrollPane.setFitToWidth(true);
		scrollPane.setPrefHeight(280);
		scrollPane.setStyle(
		        "-fx-background: transparent;" +
		        "-fx-background-color: transparent;" +
		        "-fx-border-color: transparent;"
		);
		scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
		
		VBox content = new VBox(15);
		content.setAlignment(Pos.CENTER);
		content.getChildren().addAll(title, scrollPane);

		whiteBox.getChildren().addAll(header, content);
		root.getChildren().add(whiteBox);

		applyFadeTransition(root);
		return new Scene(root, WIDTH, HEIGHT);
	}

	private Scene createQuizScene(Stage stage, String subject, String difficulty, int level) {
		// ================= QUIZ DATA =================
		List<Question> questions;

		if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 1) {
			questions = QuestionBank.getPythonEasyLevel1Questions();
		} else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 2) {
			questions = QuestionBank.getPythonEasyLevel2Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 3) {
			    questions = QuestionBank.getPythonEasyLevel3Questions();
	    }else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 4) {
	    	questions = QuestionBank.getPythonEasyLevel4Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 5) {
		    questions = QuestionBank.getPythonEasyLevel5Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 6) {
		    questions = QuestionBank.getPythonEasyLevel6Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 7) {
		    questions = QuestionBank.getPythonEasyLevel7Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 8) {
		    questions = QuestionBank.getPythonEasyLevel8Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 9) {
		    questions = QuestionBank.getPythonEasyLevel9Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("EASY") && level == 10) {
		    questions = QuestionBank.getPythonEasyLevel10Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 1) {
			questions = QuestionBank.getPythonMediumLevel1Questions();
		} else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 2) {
			questions = QuestionBank.getPythonMediumLevel2Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 3) {
		    questions = QuestionBank.getPythonMediumLevel3Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 4) {
		    questions = QuestionBank.getPythonMediumLevel4Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 5) {
		    questions = QuestionBank.getPythonMediumLevel5Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 6) {
		    questions = QuestionBank.getPythonMediumLevel6Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 7) {
		    questions = QuestionBank.getPythonMediumLevel7Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 8) {
		    questions = QuestionBank.getPythonMediumLevel8Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 9) {
		    questions = QuestionBank.getPythonMediumLevel9Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("MEDIUM") && level == 10) {
		    questions = QuestionBank.getPythonMediumLevel10Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 1) {
			questions = QuestionBank.getPythonHardLevel1Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 2) {
			questions = QuestionBank.getPythonHardLevel2Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 3) {
		    questions = QuestionBank.getPythonHardLevel3Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 4) {
		    questions = QuestionBank.getPythonHardLevel4Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 5) {
		    questions = QuestionBank.getPythonHardLevel5Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 6) {
		    questions = QuestionBank.getPythonHardLevel6Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 7) {
		    questions = QuestionBank.getPythonHardLevel7Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 8) {
		    questions = QuestionBank.getPythonHardLevel8Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 9) {
		    questions = QuestionBank.getPythonHardLevel9Questions();
		}else if (subject.equals("PYTHON") && difficulty.equals("HARD") && level == 10) {
		    questions = QuestionBank.getPythonHardLevel10Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 1) {
			questions = QuestionBank.getJavaEasyLevel1Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 2) {
			questions = QuestionBank.getJavaEasyLevel2Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 3) {
		    questions = QuestionBank.getJavaEasyLevel3Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 4) {
		    questions = QuestionBank.getJavaEasyLevel4Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 5) {
		    questions = QuestionBank.getJavaEasyLevel5Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 6) {
		    questions = QuestionBank.getJavaEasyLevel6Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 7) {
		    questions = QuestionBank.getJavaEasyLevel7Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 8) {
		    questions = QuestionBank.getJavaEasyLevel8Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 9) {
		    questions = QuestionBank.getJavaEasyLevel9Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("EASY") && level == 10) {
		    questions = QuestionBank.getJavaEasyLevel10Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 1) {
			questions = QuestionBank.getJavaMediumLevel1Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 2) {
			questions = QuestionBank.getJavaMediumLevel2Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 3) {
		    questions = QuestionBank.getJavaMediumLevel3Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 4) {
		    questions = QuestionBank.getJavaMediumLevel4Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 5) {
		    questions = QuestionBank.getJavaMediumLevel5Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 6) {
		    questions = QuestionBank.getJavaMediumLevel6Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 7) {
		    questions = QuestionBank.getJavaMediumLevel7Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 8) {
		    questions = QuestionBank.getJavaMediumLevel8Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 9) {
		    questions = QuestionBank.getJavaMediumLevel9Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("MEDIUM") && level == 10) {
		    questions = QuestionBank.getJavaMediumLevel10Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 1) {
			questions = QuestionBank.getJavaHardLevel1Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 2) {
			questions = QuestionBank.getJavaHardLevel2Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 3) {
		    questions = QuestionBank.getJavaHardLevel3Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 4) {
		    questions = QuestionBank.getJavaHardLevel4Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 5) {
		    questions = QuestionBank.getJavaHardLevel5Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 6) {
		    questions = QuestionBank.getJavaHardLevel6Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 7) {
		    questions = QuestionBank.getJavaHardLevel7Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 8) {
		    questions = QuestionBank.getJavaHardLevel8Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 9) {
		    questions = QuestionBank.getJavaHardLevel9Questions();
		}else if (subject.equals("JAVA") && difficulty.equals("HARD") && level == 10) {
		    questions = QuestionBank.getJavaHardLevel10Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 1) {
			questions = QuestionBank.getGkEasyLevel1Questions();
		} else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 2) {
			questions = QuestionBank.getGkEasyLevel2Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 3) {
		    questions = QuestionBank.getGkEasyLevel3Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 4) {
		    questions = QuestionBank.getGkEasyLevel4Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 5) {
		    questions = QuestionBank.getGkEasyLevel5Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 6) {
		    questions = QuestionBank.getGkEasyLevel6Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 7) {
		    questions = QuestionBank.getGkEasyLevel7Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 8) {
		    questions = QuestionBank.getGkEasyLevel8Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 9) {
		    questions = QuestionBank.getGkEasyLevel9Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("EASY") && level == 10) {
		    questions = QuestionBank.getGkEasyLevel10Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 1) {
			questions = QuestionBank.getGkMediumLevel1Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 2) {
			questions = QuestionBank.getGkMediumLevel2Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 3) {
		    questions = QuestionBank.getGkMediumLevel3Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 4) {
		    questions = QuestionBank.getGkMediumLevel4Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 5) {
		    questions = QuestionBank.getGkMediumLevel5Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 6) {
		    questions = QuestionBank.getGkMediumLevel6Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 7) {
		    questions = QuestionBank.getGkMediumLevel7Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 8) {
		    questions = QuestionBank.getGkMediumLevel8Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 9) {
		    questions = QuestionBank.getGkMediumLevel9Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("MEDIUM") && level == 10) {
		    questions = QuestionBank.getGkMediumLevel10Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 1) {
			questions = QuestionBank.getGkHardLevel1Questions();
		} else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 2) {
			questions = QuestionBank.getGkHardLevel2Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 3) {
		    questions = QuestionBank.getGkHardLevel3Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 4) {
		    questions = QuestionBank.getGkHardLevel4Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 5) {
		    questions = QuestionBank.getGkHardLevel5Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 6) {
		    questions = QuestionBank.getGkHardLevel6Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 7) {
		    questions = QuestionBank.getGkHardLevel7Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 8) {
		    questions = QuestionBank.getGkHardLevel8Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 9) {
		    questions = QuestionBank.getGkHardLevel9Questions();
		}else if (subject.equals("GENERAL KNOWLEDGE") && difficulty.equals("HARD") && level == 10) {
		    questions = QuestionBank.getGkHardLevel10Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 1) {
			questions = QuestionBank.getEntertainmentEasyLevel1Questions();
		} else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 2) {
			questions = QuestionBank.getEntertainmentEasyLevel2Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 3) {
		    questions = QuestionBank.getEntertainmentEasyLevel3Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 4) {
		    questions = QuestionBank.getEntertainmentEasyLevel4Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 5) {
		    questions = QuestionBank.getEntertainmentEasyLevel5Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 6) {
		    questions = QuestionBank.getEntertainmentEasyLevel6Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 7) {
		    questions = QuestionBank.getEntertainmentEasyLevel7Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 8) {
		    questions = QuestionBank.getEntertainmentEasyLevel8Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 9) {
		    questions = QuestionBank.getEntertainmentEasyLevel9Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("EASY") && level == 10) {
		    questions = QuestionBank.getEntertainmentEasyLevel10Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 1) {
			questions = QuestionBank.getEntertainmentMediumLevel1Questions();
		} else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 2) {
			questions = QuestionBank.getEntertainmentMediumLevel2Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 3) {
		    questions = QuestionBank.getEntertainmentMediumLevel3Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 4) {
		    questions = QuestionBank.getEntertainmentMediumLevel4Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 5) {
		    questions = QuestionBank.getEntertainmentMediumLevel5Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 6) {
		    questions = QuestionBank.getEntertainmentMediumLevel6Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 7) {
		    questions = QuestionBank.getEntertainmentMediumLevel7Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 8) {
		    questions = QuestionBank.getEntertainmentMediumLevel8Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 9) {
		    questions = QuestionBank.getEntertainmentMediumLevel9Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("MEDIUM") && level == 10) {
		    questions = QuestionBank.getEntertainmentMediumLevel10Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 1) {
			questions = QuestionBank.getEntertainmentHardLevel1Questions();
		} else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 2) {
			questions = QuestionBank.getEntertainmentHardLevel2Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 3) {
		    questions = QuestionBank.getEntertainmentHardLevel3Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 4) {
		    questions = QuestionBank.getEntertainmentHardLevel4Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 5) {
		    questions = QuestionBank.getEntertainmentHardLevel5Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 6) {
		    questions = QuestionBank.getEntertainmentHardLevel6Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 7) {
		    questions = QuestionBank.getEntertainmentHardLevel7Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 8) {
		    questions = QuestionBank.getEntertainmentHardLevel8Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 9) {
		    questions = QuestionBank.getEntertainmentHardLevel9Questions();
		}else if (subject.equals("ENTERTAINMENT") && difficulty.equals("HARD") && level == 10) {
		    questions = QuestionBank.getEntertainmentHardLevel10Questions();
		}else {
			questions = List.of(); // empty for now
		}
		Collections.shuffle(questions);
		
		for (Question q : questions) {
		    q.shuffleOptions();
		}
		
		final int[] currentIndex = { 0 };
		final int[] score = { 0 };
		final int[] timeLeft = { 15 };
		Timeline timeline = new Timeline();

		// ================= UI =================
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");
		
		VBox whiteBox = new VBox(30);
		whiteBox.setMaxWidth(650);
		whiteBox.setAlignment(Pos.CENTER);
		whiteBox.setStyle("-fx-background-color: white;" + "-fx-padding: 40;" + "-fx-background-radius: 25;"
				+ "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 15, 0, 0, 5);");

		Label title = new Label(subject + " - " + difficulty + " - LEVEL " + level);
		title.setFont(new Font("Times New Roman", 20));

		Label questionLabel = new Label();
		questionLabel.setWrapText(true);
		questionLabel.setFont(new Font("Arial", 22));
		questionLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #333333;");
		questionLabel.setMaxWidth(550);

		Label timerLabel = new Label();
		timerLabel.setFont(new Font("Arial", 18));
		timerLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #E74C3C;");

		Button optionA = createPurpleButton("");
		Button optionB = createPurpleButton("");
		Button optionC = createPurpleButton("");
		Button optionD = createPurpleButton("");

		optionA.setOnAction(
				e -> handleAnswerClick(0, questions.get(currentIndex[0]), optionA, optionB, optionC, optionD, score));

		optionB.setOnAction(
				e -> handleAnswerClick(1, questions.get(currentIndex[0]), optionA, optionB, optionC, optionD, score));

		optionC.setOnAction(
				e -> handleAnswerClick(2, questions.get(currentIndex[0]), optionA, optionB, optionC, optionD, score));

		optionD.setOnAction(
				e -> handleAnswerClick(3, questions.get(currentIndex[0]), optionA, optionB, optionC, optionD, score));
		Button nextBtn = createPurpleButton("NEXT");
		Runnable startTimer = () -> {
			timeLeft[0] = 15;
			timerLabel.setText("Time Left: " + timeLeft[0] + " sec");
			timerLabel.setStyle(
			        "-fx-font-size: 18px;" +
			        "-fx-font-weight: bold;" +
			        "-fx-text-fill: #E74C3C;"
			);
			timeline.stop();
			timeline.getKeyFrames().clear();

			KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), e -> {
			    timeLeft[0]--;

			    timerLabel.setText("Time Left: " + timeLeft[0] + " sec");

			    if (timeLeft[0] <= 5) {
			        timerLabel.setStyle(
			                "-fx-font-size: 22px;" +
			                "-fx-font-weight: bold;" +
			                "-fx-text-fill: #C0392B;"
			        );
			    }

			    if (timeLeft[0] <= 0) {
			        timeline.stop();

			        timerLabel.setText("⏰ Time's Up!");
			        timerLabel.setStyle(
			                "-fx-font-size: 22px;" +
			                "-fx-font-weight: bold;" +
			                "-fx-text-fill: #E74C3C;"
			        );

			        PauseTransition pause = new PauseTransition(Duration.seconds(0.7));
			        pause.setOnFinished(event -> nextBtn.fire());
			        pause.play();
			    }
			});

			timeline.getKeyFrames().add(keyFrame);
			timeline.setCycleCount(Timeline.INDEFINITE);
			timeline.play();
		};
		// ===== Load first question =====

		if (!questions.isEmpty()) {
			Question q = questions.get(0);
			questionLabel.setText(q.getQuestionText());
			optionA.setText(q.getOptions().get(0));
			optionB.setText(q.getOptions().get(1));
			optionC.setText(q.getOptions().get(2));
			optionD.setText(q.getOptions().get(3));
			startTimer.run();
		}
		nextBtn.setOnAction(e -> {
			optionA.setDisable(false);
			optionB.setDisable(false);
			optionC.setDisable(false);
			optionD.setDisable(false);

			String purpleStyle = createPurpleButton("").getStyle();

			optionA.setStyle(purpleStyle);
			optionB.setStyle(purpleStyle);
			optionC.setStyle(purpleStyle);
			optionD.setStyle(purpleStyle);

			currentIndex[0]++;

			if (currentIndex[0] < 5 && currentIndex[0] < questions.size()) {
				Question q = questions.get(currentIndex[0]);
				questionLabel.setText(q.getQuestionText());
				optionA.setText(q.getOptions().get(0));
				optionB.setText(q.getOptions().get(1));
				optionC.setText(q.getOptions().get(2));
				optionD.setText(q.getOptions().get(3));
				startTimer.run();

			} else {
				timeline.stop();
				stage.setScene(createLevelCompletedScene(stage, subject, difficulty, level, score[0]));

			}

		});

		VBox optionsBox = new VBox(15, optionA, optionB, optionC, optionD);
		optionsBox.setAlignment(Pos.CENTER);
		optionsBox.setMaxWidth(500);

		whiteBox.getChildren().addAll(title, timerLabel, questionLabel, optionsBox, nextBtn);
		root.getChildren().add(whiteBox);

		applyFadeTransition(root);
		return new Scene(root, WIDTH, HEIGHT);
	}

	private Scene createLevelCompletedScene(Stage stage, String subject, String difficulty, int level, int score) {

		int totalQuestions = 5;
		int percentage = (score * 100) / totalQuestions;
		leaderboard.add(new ScoreRecord(currentUser, subject, difficulty, percentage));
		saveLeaderboardToFile();
		boolean isPassed = percentage >= 40;

		// ---------- UNLOCK NEXT LEVEL ----------
		if (isPassed) {
			String key = subject + "_" + difficulty;
			int unlockedUpto = unlockedLevels.getOrDefault(key, 1);

			if (level + 1 > unlockedUpto) {
			    unlockedLevels.put(key, level + 1);
			    saveProgressToFile();
			}
		}

		// ---------- UI ----------
		VBox root = new VBox(25);
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

		VBox whiteBox = new VBox(18);
		whiteBox.setAlignment(Pos.CENTER);
		whiteBox.setMaxWidth(500);
		whiteBox.setStyle("-fx-background-color: white;" + "-fx-padding: 40;" + "-fx-background-radius: 40;");

		Label title = new Label("LEVEL " + level + " COMPLETED 🎉");
		title.setFont(new Font("Times New Roman", 32));
		title.setStyle("-fx-font-weight: bold;");

		Label scoreLabel = new Label("Score: " + score + " / 5");
		scoreLabel.setFont(new Font("Arial", 20));

		Label percentLabel = new Label("Percentage: " + percentage + "%");
		percentLabel.setFont(new Font("Arial", 22));
		percentLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #2C3E50;");

		Label resultLabel = new Label(isPassed ? "RESULT: PASS ✅" : "RESULT: FAIL ❌");
		resultLabel.setFont(new Font("Arial", 24));
		resultLabel.setStyle(isPassed ? "-fx-text-fill: #2ECC71; -fx-font-weight: bold;"
				: "-fx-text-fill: #E74C3C; -fx-font-weight: bold;");

		Label messageLabel;
		if (percentage == 100) {
			messageLabel = new Label("Outstanding Performance! 🌟");
		} else if (percentage >= 80) {
			messageLabel = new Label("Excellent Work! 💯");
		} else if (percentage >= 60) {
			messageLabel = new Label("Good Job 👍");
		} else if (percentage >= 40) {
			messageLabel = new Label("You Passed ✔ Keep Improving!");
		} else {
			messageLabel = new Label("Don't Give Up! Try Again 💪");
		}

		messageLabel.setFont(new Font("Arial", 16));

		Button backBtn = createPurpleButton("BACK TO LEVELS");
		backBtn.setOnAction(e -> stage.setScene(createLevelScene(stage, subject, difficulty)));

		Button retryBtn = createPurpleButton("RETRY LEVEL");
		retryBtn.setOnAction(e -> stage.setScene(createQuizScene(stage, subject, difficulty, level)));

		if (isPassed) {
			whiteBox.getChildren().addAll(title, scoreLabel, percentLabel, resultLabel, messageLabel, backBtn);
		} else {
			whiteBox.getChildren().addAll(title, scoreLabel, percentLabel, resultLabel, messageLabel, retryBtn,
					backBtn);
		}

		root.getChildren().add(whiteBox);

		// Fade Animation
		root.setOpacity(0);
		FadeTransition fade = new FadeTransition(Duration.seconds(0.8), root);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();

		return new Scene(root, WIDTH, HEIGHT);
	}

	private Scene createCongratulationsScene(Stage stage, String subject, String difficulty) {

		VBox root = new VBox(30);
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

		VBox whiteBox = new VBox(25);
		whiteBox.setAlignment(Pos.CENTER);
		whiteBox.setMaxWidth(550);
		whiteBox.setStyle("-fx-background-color: white;" + "-fx-padding: 45;" + "-fx-background-radius: 25;"
				+ "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 15, 0, 0, 5);");

		Label title = new Label("🎉 CONGRATULATIONS 🎉");
		title.setFont(new Font("Times New Roman", 34));
		title.setStyle("-fx-font-weight: bold;");

		Label message = new Label("You have successfully completed\n" + subject + " - " + difficulty + "!");
		message.setFont(new Font("Arial", 20));
		message.setStyle("-fx-text-fill: #333333;");

		Button backBtn = createPurpleButton("BACK TO SUBJECTS");
		backBtn.setOnAction(e -> stage.setScene(createSubjectScene(stage)));

		whiteBox.getChildren().addAll(title, message, backBtn);
		root.getChildren().add(whiteBox);

		Scene scene = new Scene(root, WIDTH, HEIGHT);

		// Fade animation again
		root.setOpacity(0);
		FadeTransition fade = new FadeTransition(Duration.seconds(1), root);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();

		return scene;
		}
	private void applyFadeTransition(Parent root) {
	    root.setOpacity(0);

	    FadeTransition fade = new FadeTransition(Duration.seconds(0.5), root);
	    fade.setFromValue(0);
	    fade.setToValue(1);
	    fade.play();
	}
	// =========================
	// LOGIN SCENE
	// =========================
	private Scene createLoginScene(Stage stage) {

	    VBox root = new VBox(20);
	    root.setAlignment(Pos.CENTER);
	    root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

	    VBox whiteBox = new VBox(15);
	    whiteBox.setAlignment(Pos.CENTER);
	    whiteBox.setMaxWidth(400);
	    whiteBox.setStyle(
	            "-fx-background-color: white;" +
	            "-fx-padding: 40;" +
	            "-fx-background-radius: 25;" +
	            "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 15, 0, 0, 5);"
	    );

	    Label title = new Label("LOGIN");
	    title.setFont(new Font("Arial", 26));
	    title.setStyle("-fx-font-weight: bold;");

	    TextField usernameField = new TextField();
	    usernameField.setPromptText("Enter Username");

	    PasswordField passwordField = new PasswordField();
	    passwordField.setPromptText("Enter Password");

	    Label messageLabel = new Label();

	    Button loginBtn = createPurpleButton("LOGIN");

	    loginBtn.setOnAction(e -> {
	        String username = usernameField.getText();
	        String password = passwordField.getText();

	        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
	            currentUser = username;
	            stage.setScene(createWelcomeScene(stage));
	        }else {
	            messageLabel.setText("Invalid username or password");
	            messageLabel.setStyle("-fx-text-fill: red;");
	        }
	    });

	    whiteBox.getChildren().addAll(title, usernameField, passwordField, loginBtn, messageLabel);
	    root.getChildren().add(whiteBox);

	    applyFadeTransition(root);

	    return new Scene(root, WIDTH, HEIGHT);
	}
	private static class ScoreRecord {
	    String username;
	    String subject;
	    String difficulty;
	    int percentage;

	    public ScoreRecord(String username, String subject, String difficulty, int percentage) {
	        this.username = username;
	        this.subject = subject;
	        this.difficulty = difficulty;
	        this.percentage = percentage;
	    }
	}
	private Scene createLeaderboardScene(Stage stage) {

		StackPane root = new StackPane();
	    root.setAlignment(Pos.CENTER);
	    root.setStyle("-fx-background-color: " + PRIMARY_COLOR + ";");

	    VBox whiteBox = new VBox(15);
	    whiteBox.setAlignment(Pos.CENTER);
	    whiteBox.setMaxHeight(Region.USE_PREF_SIZE);
	    whiteBox.setPrefHeight(450);
	    whiteBox.setPrefHeight(500);
	    whiteBox.setMaxWidth(800);
	    whiteBox.setStyle(
	            "-fx-background-color: white;" +
	            "-fx-padding: 50;" +
	            "-fx-background-radius: 25;" +
	            "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 15, 0, 0, 5);"
	    );

	    Label title = new Label("🏆 LEADERBOARD");
	    title.setFont(new Font("Times New Roman", 26));
	    title.setStyle("-fx-font-weight: bold;");

	    VBox scoresBox = new VBox(10);
	    scoresBox.setAlignment(Pos.CENTER_LEFT);

	    leaderboard.sort((a, b) -> b.percentage - a.percentage);

	    for (int i = 0; i < leaderboard.size() && i < 10; i++) {

	        ScoreRecord record = leaderboard.get(i);

	        Label scoreLabel = new Label(
	                (i + 1) + ".  " +
	                record.username + "  |  " +
	                record.subject + "  |  " +
	                record.difficulty + "  |  " +
	                record.percentage + "%"
	        );

	        scoreLabel.setFont(new Font("Arial", 16));
	        scoreLabel.setWrapText(true);
	        scoreLabel.setMaxWidth(700);
	        scoresBox.getChildren().add(scoreLabel);
	        if (record.percentage >= 80) {
	        	scoreLabel.setStyle("-fx-text-fill: #1E8449; -fx-font-weight: bold;");
	        	scoreLabel.setWrapText(true);
	        	scoreLabel.setMaxWidth(700);
	        }	        
	    }

	    Button backBtn = createPurpleButton("BACK");
	    backBtn.setOnAction(e -> stage.setScene(createSubjectScene(stage)));

	    ScrollPane scrollPane = new ScrollPane(scoresBox);
	    scrollPane.setFitToWidth(true);
	    scrollPane.setPrefHeight(300);   // Important
	    scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
	    scrollPane.setStyle("-fx-background: transparent; -fx-background-color: transparent;");

	    whiteBox.getChildren().addAll(title, scrollPane, backBtn);
	    root.getChildren().add(whiteBox);

	    applyFadeTransition(root);

	    return new Scene(root, WIDTH, HEIGHT);
	}
	private void saveLeaderboardToFile() {
	    try (FileWriter writer = new FileWriter(LEADERBOARD_FILE)) {

	        for (ScoreRecord record : leaderboard) {
	            writer.write(
	                    record.username + "," +
	                    record.subject + "," +
	                    record.difficulty + "," +
	                    record.percentage + "\n"
	            );
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	private void loadLeaderboardFromFile() {

	    File file = new File(LEADERBOARD_FILE);

	    if (!file.exists()) return;

	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

	        String line;

	        while ((line = reader.readLine()) != null) {

	            String[] parts = line.split(",");

	            if (parts.length == 4) {

	                String username = parts[0];
	                String subject = parts[1];
	                String difficulty = parts[2];
	                int percentage = Integer.parseInt(parts[3]);

	                leaderboard.add(new ScoreRecord(username, subject, difficulty, percentage));
	            }
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	private void saveProgressToFile() {

	    try (FileWriter writer = new FileWriter(PROGRESS_FILE)) {

	        for (String key : unlockedLevels.keySet()) {

	            int value = unlockedLevels.get(key);

	            writer.write(key + "," + value + "\n");
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	private void loadProgressFromFile() {

	    File file = new File(PROGRESS_FILE);

	    if (!file.exists()) return;

	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

	        String line;

	        while ((line = reader.readLine()) != null) {

	            String[] parts = line.split(",");

	            if (parts.length == 2) {

	                String key = parts[0];
	                int value = Integer.parseInt(parts[1]);

	                unlockedLevels.put(key, value);
	            }
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	private Button createWhiteButton(String text) {

	    Button btn = new Button(text);

	    btn.setStyle(
	            "-fx-background-color: white;" +
	            "-fx-text-fill: #7B3FA1;" +
	            "-fx-font-size: 15px;" +
	            "-fx-font-weight: bold;" +
	            "-fx-padding: 10 28 10 28;" +
	            "-fx-background-radius: 15;"
	    );

	    return btn;
	}
	private Button createLogoutButton(Stage stage) {

	    Button logoutBtn = createWhiteButton("LOGOUT");

	    logoutBtn.setOnAction(e -> {
	        currentUser = null;
	        stage.setScene(createLoginScene(stage));
	    });

	    return logoutBtn;
	}
}
