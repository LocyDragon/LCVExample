package com.buttonlib.example;

import org.bukkit.plugin.java.JavaPlugin;

import com.locydragon.lcv.api.ClassLevel;
import com.locydragon.lcv.api.CodeList;
import com.locydragon.lcv.api.NormalClassWriter;

public class Main extends JavaPlugin{
@Override
public void onEnable() {
	NormalClassWriter writer = new NormalClassWriter("Test");
	CodeList list = new CodeList();
	list.add("System.out.println(\"test\");");
	writer.setStaticBlock(list);
	CodeList list2 = new CodeList();
	list2.add("System.out.println(what+String.valueOf(i));");
	writer.addMethod("test", list2, "String what, int i", false, ClassLevel.PRIVATE, "void");
	if (writer.write("C://test//class")) {
		System.out.println("写入代码成功");
	}
}
}
