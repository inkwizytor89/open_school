package com.enoch.openschool.converter;

import java.util.stream.Collectors;

import com.enoch.openschool.dto.UserDto;
import com.enoch.openschool.entity.User;

/**
 * Created by ashish on 13/5/17.
 */
public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(), null);
		user.setUserId(userDto.getUserId());
		user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
		userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
}
