package com.can.durumcu.service.concretes;

import com.can.durumcu.core.results.Result;
import com.can.durumcu.core.results.SuccessResult;
import com.can.durumcu.entity.FoodOrder;
import com.can.durumcu.repository.FoodOrderRepository;
import com.can.durumcu.service.abstracts.IFoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodOrderService implements IFoodOrderService {

    private final FoodOrderRepository foodOrderRepository;
    @Autowired
    public FoodOrderService(FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }

    @Override
    public Result add(FoodOrder foodOrder) {
        this.foodOrderRepository.save(foodOrder);
        return new SuccessResult("Sipariş eklendi...");
    }
}
