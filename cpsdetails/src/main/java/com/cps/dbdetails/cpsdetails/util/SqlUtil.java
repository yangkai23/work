package com.cps.dbdetails.cpsdetails.util;

public enum SqlUtil {
    PREPID("SELECT cp.name,acquisition.acq_receipt_id,pci.id AS prep_id,pci.last_orchestration_id   AS workflow_id,substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) AS filename,pci.content_info,pci.modified_date,acquisition.created_date,DELIVERY_FILES.PGUID, DELIVERY_FILES.RESPONSE_CODE, DELIVERY_FILES.RESPONSE_MESSAGE,acquisition_status.acquisition_status,osd.status_desc,repreparewf.count,acquisition.probot_id,delivery_files.delivery_file_name " + "FROM orchestrations ai " + "LEFT JOIN (SELECT preparation_content_id,COUNT(repreparation_workflow) count   FROM orchestrations WHERE repreparation_workflow = 'Y'    \r\n" + "GROUP BY preparation_content_id) repreparewf ON repreparewf.preparation_content_id = ai.preparation_content_id " + "LEFT JOIN contentset_provider        cp ON cp.id = ai.contentset_provider_id " + "LEFT JOIN orchestration_status_def   osd ON osd.id = ai.orchestration_status " + "LEFT JOIN preparation_content_info   pci ON pci.last_orchestration_id = ai.id " + "LEFT JOIN acquisition ON pci.acquisition_receipt_id = acquisition.acq_receipt_id " + "LEFT JOIN acquisition_status ON acquisition.id = acquisition_status.acquisition_id " + "LEFT JOIN orchestration_delivery_info ON pci.last_orchestration_id = orchestration_delivery_info.orchestration_id " + "LEFT JOIN delivery_files ON orchestration_delivery_info.id = delivery_files.orch_delivery_id WHERE pci.id IN "),
    WORKFLOWID("SELECT cp.name,acquisition.acq_receipt_id,pci.id AS prep_id,pci.last_orchestration_id   AS workflow_id,substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) AS filename,pci.content_info,pci.modified_date,acquisition.created_date,DELIVERY_FILES.PGUID, DELIVERY_FILES.RESPONSE_CODE, DELIVERY_FILES.RESPONSE_MESSAGE,acquisition_status.acquisition_status,osd.status_desc,repreparewf.count,acquisition.probot_id,delivery_files.delivery_file_name " + "FROM orchestrations ai " + "LEFT JOIN (SELECT preparation_content_id,COUNT(repreparation_workflow) count   FROM orchestrations WHERE repreparation_workflow = 'Y'    \r\n" + "GROUP BY preparation_content_id) repreparewf ON repreparewf.preparation_content_id = ai.preparation_content_id " + "LEFT JOIN contentset_provider        cp ON cp.id = ai.contentset_provider_id " + "LEFT JOIN orchestration_status_def   osd ON osd.id = ai.orchestration_status " + "LEFT JOIN preparation_content_info   pci ON pci.last_orchestration_id = ai.id " + "LEFT JOIN acquisition ON pci.acquisition_receipt_id = acquisition.acq_receipt_id " + "LEFT JOIN acquisition_status ON acquisition.id = acquisition_status.acquisition_id " + "LEFT JOIN orchestration_delivery_info ON pci.last_orchestration_id = orchestration_delivery_info.orchestration_id " + "LEFT JOIN delivery_files ON orchestration_delivery_info.id = delivery_files.orch_delivery_id WHERE pci.last_orchestration_id IN "),
    RECEIPTID("SELECT cp.name,acquisition.acq_receipt_id,pci.id AS prep_id,pci.last_orchestration_id   AS workflow_id,substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) AS filename,pci.content_info,pci.modified_date,acquisition.created_date,DELIVERY_FILES.PGUID, DELIVERY_FILES.RESPONSE_CODE, DELIVERY_FILES.RESPONSE_MESSAGE,acquisition_status.acquisition_status,osd.status_desc,repreparewf.count,acquisition.probot_id,delivery_files.delivery_file_name " + "FROM orchestrations ai " + "LEFT JOIN (SELECT preparation_content_id,COUNT(repreparation_workflow) count   FROM orchestrations WHERE repreparation_workflow = 'Y'    \r\n" + "GROUP BY preparation_content_id) repreparewf ON repreparewf.preparation_content_id = ai.preparation_content_id " + "LEFT JOIN contentset_provider        cp ON cp.id = ai.contentset_provider_id " + "LEFT JOIN orchestration_status_def   osd ON osd.id = ai.orchestration_status " + "LEFT JOIN preparation_content_info   pci ON pci.last_orchestration_id = ai.id " + "LEFT JOIN acquisition ON pci.acquisition_receipt_id = acquisition.acq_receipt_id " + "LEFT JOIN acquisition_status ON acquisition.id = acquisition_status.acquisition_id " + "LEFT JOIN orchestration_delivery_info ON pci.last_orchestration_id = orchestration_delivery_info.orchestration_id " + "LEFT JOIN delivery_files ON orchestration_delivery_info.id = delivery_files.orch_delivery_id WHERE ACQUISITION.ACQ_RECEIPT_ID in "),
    FILENAME("SELECT cp.name,acquisition.acq_receipt_id,pci.id AS prep_id,pci.last_orchestration_id   AS workflow_id,substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) AS filename,pci.content_info,pci.modified_date,acquisition.created_date,DELIVERY_FILES.PGUID, DELIVERY_FILES.RESPONSE_CODE, DELIVERY_FILES.RESPONSE_MESSAGE,acquisition_status.acquisition_status,osd.status_desc,repreparewf.count,acquisition.probot_id,delivery_files.delivery_file_name " + "FROM orchestrations ai " + "LEFT JOIN (SELECT preparation_content_id,COUNT(repreparation_workflow) count   FROM orchestrations WHERE repreparation_workflow = 'Y'    \r\n" + "GROUP BY preparation_content_id) repreparewf ON repreparewf.preparation_content_id = ai.preparation_content_id " + "LEFT JOIN contentset_provider        cp ON cp.id = ai.contentset_provider_id " + "LEFT JOIN orchestration_status_def   osd ON osd.id = ai.orchestration_status " + "LEFT JOIN preparation_content_info   pci ON pci.last_orchestration_id = ai.id " + "LEFT JOIN acquisition ON pci.acquisition_receipt_id = acquisition.acq_receipt_id " + "LEFT JOIN acquisition_status ON acquisition.id = acquisition_status.acquisition_id " + "LEFT JOIN orchestration_delivery_info ON pci.last_orchestration_id = orchestration_delivery_info.orchestration_id " + "LEFT JOIN delivery_files ON orchestration_delivery_info.id = delivery_files.orch_delivery_id WHERE SUBSTR(PCI.CONTENT_INFO,INSTR(PCI.CONTENT_INFO,'/',-1,1)+1) in "),
    DELIVERYFILENAME("SELECT cp.name,acquisition.acq_receipt_id,pci.id AS prep_id,pci.last_orchestration_id   AS workflow_id,substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) AS filename,pci.content_info,pci.modified_date,acquisition.created_date,DELIVERY_FILES.PGUID, DELIVERY_FILES.RESPONSE_CODE, DELIVERY_FILES.RESPONSE_MESSAGE,acquisition_status.acquisition_status,osd.status_desc,repreparewf.count,acquisition.probot_id,delivery_files.delivery_file_name " + "FROM orchestrations ai " + "LEFT JOIN (SELECT preparation_content_id,COUNT(repreparation_workflow) count   FROM orchestrations WHERE repreparation_workflow = 'Y'    \r\n" + "GROUP BY preparation_content_id) repreparewf ON repreparewf.preparation_content_id = ai.preparation_content_id " + "LEFT JOIN contentset_provider        cp ON cp.id = ai.contentset_provider_id " + "LEFT JOIN orchestration_status_def   osd ON osd.id = ai.orchestration_status " + "LEFT JOIN preparation_content_info   pci ON pci.last_orchestration_id = ai.id " + "LEFT JOIN acquisition ON pci.acquisition_receipt_id = acquisition.acq_receipt_id " + "LEFT JOIN acquisition_status ON acquisition.id = acquisition_status.acquisition_id " + "LEFT JOIN orchestration_delivery_info ON pci.last_orchestration_id = orchestration_delivery_info.orchestration_id " + "LEFT JOIN delivery_files ON orchestration_delivery_info.id = delivery_files.orch_delivery_id WHERE DELIVERY_FILE_NAME in "),
   BUNDLE_AUDIT("SELECT * FROM cps.BUNDLE_AUDIT_E2E baee WHERE FILENAME  in "),
    ARTICLEID("select * from cps.ARTICLEMETADATA where OUTPUTBUNDLENAME in "),
    ARTICLECOUNT("select OUTPUTBUNDLENAME, COUNT(*) FROM CPS.ARTICLEMETADATA WHERE OUTPUTBUNDLENAME in "),
    BulkDataByPublisherAndDate("SELECT\n" +
            "     cp.name,\n" +
            "    acquisition.acq_receipt_id,\n" +
            "    pci.id                      AS prep_id,\n" +
            "    pci.last_orchestration_id   AS workflow_id,\n" +
            "substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) as filename,\n" +
            "    pci.content_info,\n" +
            "    pci.modified_date,\n" +
            "    acquisition.created_date,\n" +
            "    DELIVERY_FILES.PGUID, DELIVERY_FILES.RESPONSE_CODE, DELIVERY_FILES.RESPONSE_MESSAGE,\n" +
            "    acquisition_status.acquisition_status,\n" +
            "    osd.status_desc,\n" +
            "    repreparewf.count,\n" +
            "    acquisition.probot_id,\n" +
            "    delivery_files.delivery_file_name\n" +
            "FROM\n" +
            "    orchestrations             ai\n" +
            "    LEFT JOIN (\n" +
            "        SELECT\n" +
            "            preparation_content_id,\n" +
            "            COUNT(repreparation_workflow) count\n" +
            "        FROM\n" +
            "            orchestrations\n" +
            "        WHERE\n" +
            "            repreparation_workflow = 'Y'\n" +
            "        GROUP BY\n" +
            "            preparation_content_id\n" +
            "    ) repreparewf ON repreparewf.preparation_content_id = ai.preparation_content_id\n" +
            "    LEFT JOIN contentset_provider        cp ON cp.id = ai.contentset_provider_id\n" +
            "    LEFT JOIN orchestration_status_def   osd ON osd.id = ai.orchestration_status\n" +
            "    LEFT JOIN preparation_content_info   pci ON pci.last_orchestration_id = ai.id\n" +
            "    LEFT JOIN acquisition ON pci.acquisition_receipt_id = acquisition.acq_receipt_id\n" +
            "    LEFT JOIN acquisition_status ON acquisition.id = acquisition_status.acquisition_id\n" +
            "    LEFT JOIN orchestration_delivery_info ON pci.last_orchestration_id = orchestration_delivery_info.orchestration_id\n" +
            "    LEFT JOIN delivery_files ON orchestration_delivery_info.id = delivery_files.orch_delivery_id\n" +
            "\n" +
            "where  ACQUISITION.CREATED_DATE >= TO_DATE('24-01-01 00:00:00', 'YY-MM-DD HH24:MI:SS') and ACQUISITION.CREATED_DATE < TO_DATE('24-05-15 23:59:59', 'YY-MM-DD HH24:MI:SS')\n" +
            /*"AND\n" +
            "CP.NAME in ('Preprints_org_Front')" +*/
            " order by ACQUISITION.CREATED_DATE"),
    DFReprepare("SELECT\n" +
            "    cp.name,\n" +
            "    substr(pci.content_info, instr(pci.content_info, '/', - 1, 1) + 1) AS filename,\n" +
            "    PCI.content_info,\n" +
            "    df.delivery_file_name,\n" +
            "pci.LAST_ORCHESTRATION_ID,\n"+
            "osd.status_desc\n"+
            "FROM\n" +
            "    cps.orchestrations orch\n" +
            "LEFT join ORCHESTRATION_DELIVERY_INFO ODI on ODI.ORCHESTRATION_ID=orch.ID\n" +
            "left join DELIVERY_FILES DF on DF.ORCH_DELIVERY_ID=ODI.ID\n" +
            " LEFT JOIN contentset_provider        cp ON cp.id = orch.contentset_provider_id\n" +
            "LEFT JOIN orchestration_status_def   osd ON osd.id = orch.orchestration_status\n"+
            "LEFT JOIN PREPARATION_CONTENT_INFO PCI on PCI.ID = orch.PREPARATION_CONTENT_ID\n" +
            "where\n" +
            "     df.delivery_file_name in "),
    Chub(
//            "select * from chub.ch_object WHERE asset_id='urn:asset:29' AND file_name in "
            "SELECT doc_pguid,file_path,file_name FROM chub.ch_object WHERE asset_id='urn:asset:29' AND file_name in ");
    private final String sql;

    SqlUtil(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        System.out.println("Inside Util");
        return this.sql;
    }
}
