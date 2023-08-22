package com.backy.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor//기본생성자와 전체생성자
public class User {
	private String id;
	private String name;
	private String password;
}
