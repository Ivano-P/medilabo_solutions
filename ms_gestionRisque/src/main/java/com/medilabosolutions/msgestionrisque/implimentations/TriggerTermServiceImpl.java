package com.medilabosolutions.ms_gestionrisque.implimentations;

import com.medilabosolutions.ms_gestionrisque.service.TriggerTermService;
import com.medilabosolutions.ms_gestionrisque.util.TriggerTermsDefaultUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the TriggerTermService interface.
 * This service provides functionality to retrieve the list of trigger terms used for risk assessment.
 * The trigger terms are fetched from the TriggerTermsDefaultUtil utility class.
 *
 * @author Ivano
 */
@Service
public class TriggerTermServiceImpl implements TriggerTermService {

    /**
     * Retrieves the list of trigger terms used for risk assessment.
     *
     * @return List of trigger terms.
     */
    @Override
    public List<String> getListOfTriggerTerms() {
        return TriggerTermsDefaultUtil.getTerms();
    }
}
