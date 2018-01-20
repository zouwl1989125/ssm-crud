package com.yuchengtech.crm.dataauth.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @describtion: autogenerated by lhqheli's Tools
 *
 * @author : lhqheli (email: lhqheli@gmail.com)
 * @date : 2014-07-31 10:31:17
 */
@Entity
@Table(name="OCRM_SYS_VIEW_MANAGER_COMM")
public class OcrmSysViewManagerComm implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(generator = "CommonSequnce", strategy = GenerationType.TABLE)
    @Column(name="ID")
    private Long id;

    @Column(name="VIEW_ID")
    private String viewId;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="PROJ_ID")
    private String projId;

    public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getViewId(){
        return this.viewId;
    }

    public void setViewId(String viewId){
        this.viewId = viewId;
    }

    public String getUserId(){
        return this.userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }


}
