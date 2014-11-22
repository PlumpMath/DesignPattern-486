package com.ls.main;

import java.util.ArrayList;
import java.util.List;

public class Boy {
	private String name;
	private List<Command> commands = new ArrayList<Command>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCommand(Command cm) {
		// TODO Auto-generated method stub
		commands.add(cm);
	}

	public void excute() {
		// TODO Auto-generated method stub
		for (Command cm : commands) {
			cm.excute();
		}
	}

	public void unDo() {
		// TODO Auto-generated method stub
		// 实现撤销操作。

	}

}
