package com.example.states.databinding;
import com.example.states.R;
import com.example.states.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDatabindingBindingImpl extends ActivityDatabindingBinding implements com.example.states.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDatabindingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityDatabindingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.counterButtonDatabinding.setTag(null);
        this.counterTextviewDatabinding.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.states.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.states.databinding.DataBindingActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.states.databinding.DataBindingActivityViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelCountLiveData((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelCountLiveData(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewmodelCountLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfViewmodelCountLiveData = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelCountLiveDataGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelCountLiveData = null;
        com.example.states.databinding.DataBindingActivityViewModel viewmodel = mViewmodel;
        java.lang.Integer viewmodelCountLiveDataGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.countLiveData
                    viewmodelCountLiveData = viewmodel.getCountLiveData();
                }
                updateLiveDataRegistration(0, viewmodelCountLiveData);


                if (viewmodelCountLiveData != null) {
                    // read viewmodel.countLiveData.getValue()
                    viewmodelCountLiveDataGetValue = viewmodelCountLiveData.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.countLiveData.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelCountLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelCountLiveDataGetValue);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.countLiveData.getValue()))
                stringValueOfViewmodelCountLiveData = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxViewmodelCountLiveDataGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.counterButtonDatabinding.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.counterTextviewDatabinding, stringValueOfViewmodelCountLiveData);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.example.states.databinding.DataBindingActivityViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.onLike();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.countLiveData
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}