参考サイト

```
https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-2.html

https://dzone.com/articles/jvm-architecture-explained

https://gakumon.tech/java/java_thread_jvm.html
```

Javaの型の分類

``` 
 primitive型　short, long, float, double, boolean, and char
 参照型　上記以外 ex String Long など
```

メモリの話

```
1.メモリはコインロッカーのようなイメージ

メモリのイメージ
番号1.空き
番号2.空き
番号3.空き
番号4.空き

2.プログラム実行時の挙動2
int i = 1; // プリミティブ型
long l = 2
String s1 = new String("string1") // 参照型
String s2 = new String("string2")  // 参照型

メモリのイメージ
番号1. 1 (i)
番号2. 2 (i)
番号3. Stringのインスタンス(new String("string1"))
番号4. メモリ番号3 (変数:String s1)
番号5. Stringのインスタンス(new String("string2");
番号6. メモリ番号:6 (変数:String s2)

2.プログラム実行時の挙動3
i = 3; 
l = 4;
s1 = s2
System.out.println(s1);
>> メモリ番号5なので、string2が表示される

メモリのイメージ
番号1. 3(i)
番号2. 4 (l)
番号3. Stringのインスタンス(new String("string1"))
番号4. メモリ番号6 (変数:String s1)
番号5. Stringのインスタンス(new String("string2");
番号6. メモリ番号:6 (変数:String s2)

＊番号3はどこからもアクセスできなくなるので、ガベージコレクト対象になる
```

JVMのメモリの話

``` 
Stack Area ローカル変数を管理
Heap Area　インスタンスを管理
- コンスタントプール
Method Area　クラス情報(クラスのコンストラクタ、フィールド、メソッド)情報を管理

```