enumの参考のクラス

超基本パターン

https://github.com/spring-projects/spring-boot/blob/47516b50c39bd6ea924a1f6720ce6d[…]ork/boot/test/autoconfigure/properties/SkipPropertyMapping.java


自身で値を定義するパターン

https://github.com/spring-projects/spring-boot/blob/47516b50c39bd6ea924a1f6720ce6d[…]/java/org/springframework/boot/actuate/endpoint/ApiVersion.java

クラス内フィールドの型のひとつがenumでクラス内でenumを宣言しているパターン

https://github.com/spring-projects/spring-boot/blob/47516b50c39bd6ea924a1f6720ce6d[…]org/springframework/boot/autoconfigure/web/ErrorProperties.java
*static つけなくても、static innerクラスと同様の呼び方で呼ぶことができる

enumの中からキーをもとに適切な要素を返すstaticメソッドを持つenum パターン1

https://blog1.mammb.com/entry/20110212/1297538188
*この例のようにマッチしない場合にnull返さず、 IllegalArgumentException返しましょう

enumの中から何かしらから要素を返すstaticメソッドを持つenum パターン2

https://github.com/spring-projects/spring-boot/blob/a05da3ae1474f0ad4cd1bb9e9645c0[…]/src/main/java/org/springframework/boot/system/JavaVersion.java

enumの要素自体にメソッドを持つパターン

Effective Java　ITEM34　Operation



