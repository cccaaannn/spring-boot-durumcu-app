package com.can.durumcu;

import com.can.durumcu.core.results.DataResult;
import com.can.durumcu.core.results.Result;
import com.can.durumcu.entity.Durum;
import com.can.durumcu.entity.FoodOrder;
import com.can.durumcu.entity.Ingredient;
import com.can.durumcu.service.abstracts.IDurumService;
import com.can.durumcu.service.abstracts.IFoodOrderService;
import com.can.durumcu.service.abstracts.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class dbTest {
    private final IIngredientService ingredientService;
    private final IDurumService iDurumService;
    private final IFoodOrderService iFoodOrderService;


    @Autowired
    public dbTest(IIngredientService ingredientService, IDurumService iDurumService, IFoodOrderService iFoodOrderService) {
        this.ingredientService = ingredientService;
        this.iDurumService = iDurumService;
        this.iFoodOrderService = iFoodOrderService;
    }

//    @PostConstruct
//    void add(){
//        Result result = ingredientService.add(new Ingredient(null,"marul",null));
//        System.out.println(result);
//        ingredientService.add(new Ingredient(null, "domates", null));
//        ingredientService.add(new Ingredient(null, "soğan", null));
//        ingredientService.add(new Ingredient(null, "tavuk", null));
//        ingredientService.add(new Ingredient(null, "et", null));
//        ingredientService.add(new Ingredient(null, "lavaş", null));
//        ingredientService.add(new Ingredient(null, "ekmek", null));
//        ingredientService.add(new Ingredient(null, "balık", null));
//
//        DataResult<Ingredient> balik = ingredientService.getByName("balık");
//        DataResult<Ingredient> tavuk = ingredientService.getByName("tavuk");
//        DataResult<Ingredient> marul = ingredientService.getByName("marul");
//        DataResult<Ingredient> et = ingredientService.getByName("et");
//        DataResult<Ingredient> sogan = ingredientService.getByName("soğan");
//        DataResult<Ingredient> lavas = ingredientService.getByName("lavaş");
//        DataResult<Ingredient> domates = ingredientService.getByName("domates");
//        DataResult<Ingredient> ekmek = ingredientService.getByName("ekmek");
//
//        List<Ingredient> ingredientsTavukDurum = new ArrayList<Ingredient>();
//        ingredientsTavukDurum.add(lavas.getData());
//        ingredientsTavukDurum.add(tavuk.getData());
//        ingredientsTavukDurum.add(marul.getData());
//        ingredientsTavukDurum.add(domates.getData());
//
//        List<Ingredient> ingredientsAdanaDurum = new ArrayList<Ingredient>();
//        ingredientsAdanaDurum.add(lavas.getData());
//        ingredientsAdanaDurum.add(et.getData());
//        ingredientsAdanaDurum.add(marul.getData());
//        ingredientsAdanaDurum.add(sogan.getData());
//
//        List<Ingredient> ingredientsBalikEkmek = new ArrayList<Ingredient>();
//        ingredientsBalikEkmek.add(ekmek.getData());
//        ingredientsBalikEkmek.add(balik.getData());
//        ingredientsBalikEkmek.add(marul.getData());
//        ingredientsBalikEkmek.add(domates.getData());
//
//        iDurumService.add((new Durum(null, "tavukDurum", ingredientsTavukDurum , null)));
//        iDurumService.add((new Durum(null, "adanaDurum", ingredientsAdanaDurum , null)));
//        iDurumService.add((new Durum(null, "balikEkmek", ingredientsBalikEkmek , null)));
//
//        DataResult<Durum> tavukDurum = iDurumService.getByName("tavukDurum");
//        DataResult<Durum> adanaDurum = iDurumService.getByName("adanaDurum");
//        DataResult<Durum> balikEkmek = iDurumService.getByName("balikEkmek");
//
//
//        iFoodOrderService.add(new FoodOrder(null, adanaDurum.getData()));
//        iFoodOrderService.add(new FoodOrder(null, tavukDurum.getData()));
//        iFoodOrderService.add(new FoodOrder(null, balikEkmek.getData()));
//
//    }

}
