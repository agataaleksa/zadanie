package com.aleksa.wall;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
	
	private List<Block> blocks;

	@Override
	public Optional<Block> findBlockByColor(String color) {
		
		
		return blocks.stream()
				.filter(b -> b.getColor().equalsIgnoreCase(color))
				.findAny();
	}

	@Override
	public List<Block> findBlocksByMaterial(String material) {

		return blocks.stream()
				.filter(b -> b.getMaterial().equalsIgnoreCase(material))
				.collect(Collectors.toList());
	}

	@Override
	public int count() { 

		return blocks.size();
	}

}
