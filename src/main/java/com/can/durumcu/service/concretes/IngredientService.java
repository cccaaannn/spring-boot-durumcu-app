package com.can.durumcu.service.concretes;

import com.can.durumcu.core.results.DataResult;
import com.can.durumcu.core.results.Result;
import com.can.durumcu.core.results.SuccessDataResult;
import com.can.durumcu.core.results.SuccessResult;
import com.can.durumcu.entity.Ingredient;
import com.can.durumcu.repository.IngredientRepository;
import com.can.durumcu.service.abstracts.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService implements IIngredientService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Result add(Ingredient ingredient) {
        this.ingredientRepository.save(ingredient);
        return new SuccessResult("Malzeme eklendi...");
    }

    @Override
    public Result update(Ingredient ingredient) {
        this.ingredientRepository.save(ingredient);
        return new SuccessResult("Malzeme güncellendi...");
    }

    @Override
    public Result delete(Long id) {
        this.ingredientRepository.deleteById(id);
        return new SuccessResult("Malzeme silindi...");
    }

    @Override
    public DataResult<Ingredient> getByName(String name) {
        return new SuccessDataResult<Ingredient>(this.ingredientRepository.getByName(name));
    }
}
