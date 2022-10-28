package com.example.hilt

import androidx.fragment.app.FragmentActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object UserModule {
    @Provides
    fun provideuserSQL(sqlRepository: SqlRepository):UserRepository
    {
        return sqlRepository
    }
    @Provides
    @FirebaseAnnotation
    fun provideuserfirebase(firebaseRepository: FirebaseRepository):UserRepository
    {
        return firebaseRepository
    }
}