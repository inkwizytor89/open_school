package com.enoch.openschool.converter;

import com.enoch.openschool.dto.SkillDto;
import com.enoch.openschool.entity.Skill;

/**
 * Created by ashish on 13/5/17.
 */
public class SkillConverter {
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}
}
