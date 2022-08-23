package com.can.durumcu.service.concretes;

import com.can.durumcu.core.results.DataResult;
import com.can.durumcu.core.results.Result;
import com.can.durumcu.core.results.SuccessDataResult;
import com.can.durumcu.core.results.SuccessResult;
import com.can.durumcu.entity.Durum;
import com.can.durumcu.repository.DurumRepository;
import com.can.durumcu.service.abstracts.IDurumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DurumService implements IDurumService {

    private final DurumRepository durumRepository;
    @Autowired
    public DurumService(DurumRepository durumRepository) {
        this.durumRepository = durumRepository;
    }

    @Override
    public Result add(Durum durum) {
        this.durumRepository.save(durum);
        return new SuccessResult("Dürüm eklendi...");
    }

    @Override
    public DataResult<Durum> getByName(String name) {
        return new SuccessDataResult<Durum>(this.durumRepository.getByName(name));
    }
}
