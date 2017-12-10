package com.henghao.service;

import com.henghao.domain.entity.CarItude;
import com.henghao.domain.entity.result.Result;

public interface ICarItudeTestService {
    Result addItude(CarItude paramCarItude);

    Result findAllItude();

    Result findLatest();

    Result positionDeviation(String paramString);
}
