package com.example.app.mapper;

import com.example.app.domain.Author;

public interface AuthorMapper {

	Author selectByLoginId(String loginId);
}
