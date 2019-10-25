// Generated by data binding compiler. Do not edit!
package com.example.states.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.states.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDatabindingBinding extends ViewDataBinding {
  @NonNull
  public final Button counterButtonDatabinding;

  @NonNull
  public final TextView counterTextviewDatabinding;

  @Bindable
  protected DataBindingActivityViewModel mViewmodel;

  protected ActivityDatabindingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button counterButtonDatabinding, TextView counterTextviewDatabinding) {
    super(_bindingComponent, _root, _localFieldCount);
    this.counterButtonDatabinding = counterButtonDatabinding;
    this.counterTextviewDatabinding = counterTextviewDatabinding;
  }

  public abstract void setViewmodel(@Nullable DataBindingActivityViewModel viewmodel);

  @Nullable
  public DataBindingActivityViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivityDatabindingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_databinding, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDatabindingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDatabindingBinding>inflateInternal(inflater, R.layout.activity_databinding, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDatabindingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_databinding, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDatabindingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDatabindingBinding>inflateInternal(inflater, R.layout.activity_databinding, null, false, component);
  }

  public static ActivityDatabindingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDatabindingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDatabindingBinding)bind(component, view, R.layout.activity_databinding);
  }
}
