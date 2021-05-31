package javaNested.classes;

public class MainNested {

	public static void main(String[] args) {
		OuterClass1.StaticNestedClass  nestedObject = new OuterClass1.StaticNestedClass();
		
		OuterClass2 innerObject = new OuterClass2();
		OuterClass2.InnerClass outerObject = innerObject.new InnerClass();
		
		ShadowTest1 st = new ShadowTest1();
		ShadowTest1.FirstLevel fl = st.new FirstLevel();
		fl.methodFirstLevel(25);

	}

}
