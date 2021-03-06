package com.komoriwu.one.di.component;

import android.app.Activity;

import com.komoriwu.one.all.AllFragment;
import com.komoriwu.one.all.detail.fragment.AuthorDetailIndexFragment;
import com.komoriwu.one.all.detail.fragment.CategoriesDetailIndexFragment;
import com.komoriwu.one.all.detail.fragment.TagsDetailIndexFragment;
import com.komoriwu.one.all.fragment.CategoryFragment;
import com.komoriwu.one.all.fragment.DailyFragment;
import com.komoriwu.one.all.fragment.FindFragment;
import com.komoriwu.one.all.fragment.RecommendFragment;
import com.komoriwu.one.di.module.FragmentModule;
import com.komoriwu.one.di.scope.FragmentScope;
import com.komoriwu.one.me.MeFragment;
import com.komoriwu.one.one.OneFragment;

import dagger.Component;

/**
 * Created by KomoriWu
 * on 2017-09-01.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();

    void inject(OneFragment oneFragment);

    void inject(AllFragment allFragment);

    void inject(MeFragment meFragment);

    void inject(FindFragment findFragment);

    void inject(RecommendFragment recommendFragment);

    void inject(DailyFragment dailyFragment);

    void inject(CategoryFragment categoryFragment);

    void inject(CategoriesDetailIndexFragment categoriesDetailIndexFragment);

    void inject(TagsDetailIndexFragment tagsDetailIndexFragment);

    void inject(AuthorDetailIndexFragment authorDetailIndexFragment);
}
