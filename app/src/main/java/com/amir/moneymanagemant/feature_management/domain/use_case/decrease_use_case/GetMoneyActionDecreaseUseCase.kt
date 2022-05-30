package com.amir.moneymanagemant.feature_management.domain.use_case.decrease_use_case

import com.amir.moneymanagemant.feature_management.domain.model.money_decrease_model.MoneyManagementDecrease
import com.amir.moneymanagemant.feature_management.domain.repository.decrease_repository.MoneyManagementDecreaseRepository

class GetMoneyActionDecreaseUseCase(
     private val repository: MoneyManagementDecreaseRepository
) {
     suspend operator fun invoke(id:Int):MoneyManagementDecrease?{
          return repository.getMoneyActionById(id)
     }
}