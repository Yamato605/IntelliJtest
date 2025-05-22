package org.example;

public class Main {

  public static void main(String[] args) {
    System.out.println("こんにちは");
    String name = "pull";
    System.out.println(name + " さん、こんにちは！");
  }
}
/*
「IntelliJ のターミナルの操作」--------------------------------------------------------------------

Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.
新機能と改善のために最新の PowerShell をインストールしてください!https://aka.ms/PSWindows

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git init

Initialized empty Git repository in C:/Users/Owner/Downloads/Student.Management/IntelliJGitHubTest-project/.git/

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git remote add origin https://github.com/Yamato605/IntelliJtest.git

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git add .

warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'build.gradle', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'gradlew', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/org/example/Main.java', LF will be replaced by CRLF the next time Git touches it

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git commit -m "first commit"

[master (root-commit) d3624cc] first commit
 12 files changed, 435 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/gradle.xml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 build.gradle
 create mode 100644 gradle/wrapper/gradle-wrapper.jar
 create mode 100644 gradle/wrapper/gradle-wrapper.properties
 create mode 100644 gradlew
 create mode 100644 gradlew.bat
 create mode 100644 settings.gradle
 create mode 100644 src/main/java/org/example/Main.java

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git push -u origin main

error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/Yamato605/IntelliJtest.git'

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git branch -m master main

PS C:\Users\Owner\Downloads\Student.Management\IntelliJGitHubTest-project> git push -u origin main

Enumerating objects: 22, done.
Counting objects: 100% (22/22), done.
Delta compression using up to 16 threads
Compressing objects: 100% (15/15), done.
Writing objects: 100% (22/22), 60.43 KiB | 12.08 MiB/s, done.
Total 22 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Yamato605/IntelliJtest.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
----------------------------------------------------------------------------------------------------

「ターミナル操作後」
・IntelliJ で新しいブランチを作成し、名前を決める。

・コードに変更を加える。

・メニューから Git > コミット を選択し、コミットメッセージ(説明)を入力する。 > コミットとプッシュを選択。

・プルリクエストの作成と表示されていれば完了。

・プルリクエストボタンを押して、タイトルとコメントを入力する。

・プログラムに対して、コメントをしたい場合は、プルリクエストから Files Changed を選択してコメントを残す

 */