package com.springboot.TransporterAPI.Services;

import java.util.List;

import com.springboot.TransporterAPI.Entity.Transporter;
import com.springboot.TransporterAPI.Model.PostTransporter;
import com.springboot.TransporterAPI.Model.UpdateTransporter;
import com.springboot.TransporterAPI.Response.TransporterCreateResponse;
import com.springboot.TransporterAPI.Response.TransporterUpdateResponse;

public interface TransporterService {

	public TransporterCreateResponse addTransporter(Transporter postTransporter);

	public List<Transporter> getTransporters(Boolean transporterApproved, Boolean companyApproved, Integer pageNo);

	public TransporterUpdateResponse updateTransporter(String transporterId, UpdateTransporter updatetransporter);

	public void deleteTransporter(String transporterId);

	public Transporter getOneTransporter(String transporterId);

}
