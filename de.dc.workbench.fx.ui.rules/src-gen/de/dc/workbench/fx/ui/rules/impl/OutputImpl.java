/**
 */
package de.dc.workbench.fx.ui.rules.impl;

import de.dc.workbench.fx.ui.rules.Output;
import de.dc.workbench.fx.ui.rules.OutputField;
import de.dc.workbench.fx.ui.rules.RulesPackage;
import de.dc.workbench.fx.ui.rules.Uri;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.OutputImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.OutputImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.OutputImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends BaseTypeImpl implements Output {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Uri model;

	/**
	 * The cached value of the '{@link #getMapper() <em>Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapper()
	 * @generated
	 * @ordered
	 */
	protected Uri mapper;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (Uri) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.OUTPUT__MODEL, oldModel,
							model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Uri newModel) {
		Uri oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.OUTPUT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getMapper() {
		if (mapper != null && mapper.eIsProxy()) {
			InternalEObject oldMapper = (InternalEObject) mapper;
			mapper = (Uri) eResolveProxy(oldMapper);
			if (mapper != oldMapper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.OUTPUT__MAPPER, oldMapper,
							mapper));
			}
		}
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetMapper() {
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapper(Uri newMapper) {
		Uri oldMapper = mapper;
		mapper = newMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.OUTPUT__MAPPER, oldMapper, mapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<OutputField>(OutputField.class, this, RulesPackage.OUTPUT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RulesPackage.OUTPUT__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RulesPackage.OUTPUT__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case RulesPackage.OUTPUT__MAPPER:
			if (resolve)
				return getMapper();
			return basicGetMapper();
		case RulesPackage.OUTPUT__FIELDS:
			return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RulesPackage.OUTPUT__MODEL:
			setModel((Uri) newValue);
			return;
		case RulesPackage.OUTPUT__MAPPER:
			setMapper((Uri) newValue);
			return;
		case RulesPackage.OUTPUT__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends OutputField>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RulesPackage.OUTPUT__MODEL:
			setModel((Uri) null);
			return;
		case RulesPackage.OUTPUT__MAPPER:
			setMapper((Uri) null);
			return;
		case RulesPackage.OUTPUT__FIELDS:
			getFields().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RulesPackage.OUTPUT__MODEL:
			return model != null;
		case RulesPackage.OUTPUT__MAPPER:
			return mapper != null;
		case RulesPackage.OUTPUT__FIELDS:
			return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
