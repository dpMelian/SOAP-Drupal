
package com.daw;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nid",
    "uuid",
    "vid",
    "langcode",
    "type",
    "revision_timestamp",
    "revision_uid",
    "revision_log",
    "status",
    "uid",
    "title",
    "created",
    "changed",
    "promote",
    "sticky",
    "default_langcode",
    "revision_translation_affected",
    "ds_switch",
    "path",
    "body",
    "field_ambito",
    "field_tiempo_de_lectura"
})
public class Noticia {

    @JsonProperty("nid")
    private List<Nid> nid = null;
    @JsonProperty("uuid")
    private List<Uuid> uuid = null;
    @JsonProperty("vid")
    private List<Vid> vid = null;
    @JsonProperty("langcode")
    private List<Langcode> langcode = null;
    @JsonProperty("type")
    private List<Type> type = null;
    @JsonProperty("revision_timestamp")
    private List<RevisionTimestamp> revisionTimestamp = null;
    @JsonProperty("revision_uid")
    private List<RevisionUid> revisionUid = null;
    @JsonProperty("revision_log")
    private List<Object> revisionLog = null;
    @JsonProperty("status")
    private List<Status> status = null;
    @JsonProperty("uid")
    private List<Uid> uid = null;
    @JsonProperty("title")
    private List<Title> title = null;
    @JsonProperty("created")
    private List<Created> created = null;
    @JsonProperty("changed")
    private List<Changed> changed = null;
    @JsonProperty("promote")
    private List<Promote> promote = null;
    @JsonProperty("sticky")
    private List<Sticky> sticky = null;
    @JsonProperty("default_langcode")
    private List<DefaultLangcode> defaultLangcode = null;
    @JsonProperty("revision_translation_affected")
    private List<RevisionTranslationAffected> revisionTranslationAffected = null;
    @JsonProperty("ds_switch")
    private List<Object> dsSwitch = null;
    @JsonProperty("path")
    private List<Path> path = null;
    @JsonProperty("body")
    private List<Body> body = null;
    @JsonProperty("field_ambito")
    private List<FieldAmbito> fieldAmbito = null;
    @JsonProperty("field_tiempo_de_lectura")
    private List<FieldTiempoDeLectura> fieldTiempoDeLectura = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Noticia() {
    }

    /**
     * 
     * @param dsSwitch
     * @param fieldTiempoDeLectura
     * @param revisionTimestamp
     * @param created
     * @param revisionTranslationAffected
     * @param nid
     * @param revisionLog
     * @param type
     * @param title
     * @param body
     * @param uuid
     * @param fieldAmbito
     * @param vid
     * @param langcode
     * @param uid
     * @param promote
     * @param path
     * @param revisionUid
     * @param sticky
     * @param status
     * @param changed
     * @param defaultLangcode
     */
    public Noticia(List<Nid> nid, List<Uuid> uuid, List<Vid> vid, List<Langcode> langcode, List<Type> type, List<RevisionTimestamp> revisionTimestamp, List<RevisionUid> revisionUid, List<Object> revisionLog, List<Status> status, List<Uid> uid, List<Title> title, List<Created> created, List<Changed> changed, List<Promote> promote, List<Sticky> sticky, List<DefaultLangcode> defaultLangcode, List<RevisionTranslationAffected> revisionTranslationAffected, List<Object> dsSwitch, List<Path> path, List<Body> body, List<FieldAmbito> fieldAmbito, List<FieldTiempoDeLectura> fieldTiempoDeLectura) {
        super();
        this.nid = nid;
        this.uuid = uuid;
        this.vid = vid;
        this.langcode = langcode;
        this.type = type;
        this.revisionTimestamp = revisionTimestamp;
        this.revisionUid = revisionUid;
        this.revisionLog = revisionLog;
        this.status = status;
        this.uid = uid;
        this.title = title;
        this.created = created;
        this.changed = changed;
        this.promote = promote;
        this.sticky = sticky;
        this.defaultLangcode = defaultLangcode;
        this.revisionTranslationAffected = revisionTranslationAffected;
        this.dsSwitch = dsSwitch;
        this.path = path;
        this.body = body;
        this.fieldAmbito = fieldAmbito;
        this.fieldTiempoDeLectura = fieldTiempoDeLectura;
    }

    @JsonProperty("nid")
    public List<Nid> getNid() {
        return nid;
    }

    @JsonProperty("nid")
    public void setNid(List<Nid> nid) {
        this.nid = nid;
    }

    @JsonProperty("uuid")
    public List<Uuid> getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(List<Uuid> uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("vid")
    public List<Vid> getVid() {
        return vid;
    }

    @JsonProperty("vid")
    public void setVid(List<Vid> vid) {
        this.vid = vid;
    }

    @JsonProperty("langcode")
    public List<Langcode> getLangcode() {
        return langcode;
    }

    @JsonProperty("langcode")
    public void setLangcode(List<Langcode> langcode) {
        this.langcode = langcode;
    }

    @JsonProperty("type")
    public List<Type> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<Type> type) {
        this.type = type;
    }

    @JsonProperty("revision_timestamp")
    public List<RevisionTimestamp> getRevisionTimestamp() {
        return revisionTimestamp;
    }

    @JsonProperty("revision_timestamp")
    public void setRevisionTimestamp(List<RevisionTimestamp> revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    @JsonProperty("revision_uid")
    public List<RevisionUid> getRevisionUid() {
        return revisionUid;
    }

    @JsonProperty("revision_uid")
    public void setRevisionUid(List<RevisionUid> revisionUid) {
        this.revisionUid = revisionUid;
    }

    @JsonProperty("revision_log")
    public List<Object> getRevisionLog() {
        return revisionLog;
    }

    @JsonProperty("revision_log")
    public void setRevisionLog(List<Object> revisionLog) {
        this.revisionLog = revisionLog;
    }

    @JsonProperty("status")
    public List<Status> getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(List<Status> status) {
        this.status = status;
    }

    @JsonProperty("uid")
    public List<Uid> getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(List<Uid> uid) {
        this.uid = uid;
    }

    @JsonProperty("title")
    public List<Title> getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(List<Title> title) {
        this.title = title;
    }

    @JsonProperty("created")
    public List<Created> getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(List<Created> created) {
        this.created = created;
    }

    @JsonProperty("changed")
    public List<Changed> getChanged() {
        return changed;
    }

    @JsonProperty("changed")
    public void setChanged(List<Changed> changed) {
        this.changed = changed;
    }

    @JsonProperty("promote")
    public List<Promote> getPromote() {
        return promote;
    }

    @JsonProperty("promote")
    public void setPromote(List<Promote> promote) {
        this.promote = promote;
    }

    @JsonProperty("sticky")
    public List<Sticky> getSticky() {
        return sticky;
    }

    @JsonProperty("sticky")
    public void setSticky(List<Sticky> sticky) {
        this.sticky = sticky;
    }

    @JsonProperty("default_langcode")
    public List<DefaultLangcode> getDefaultLangcode() {
        return defaultLangcode;
    }

    @JsonProperty("default_langcode")
    public void setDefaultLangcode(List<DefaultLangcode> defaultLangcode) {
        this.defaultLangcode = defaultLangcode;
    }

    @JsonProperty("revision_translation_affected")
    public List<RevisionTranslationAffected> getRevisionTranslationAffected() {
        return revisionTranslationAffected;
    }

    @JsonProperty("revision_translation_affected")
    public void setRevisionTranslationAffected(List<RevisionTranslationAffected> revisionTranslationAffected) {
        this.revisionTranslationAffected = revisionTranslationAffected;
    }

    @JsonProperty("ds_switch")
    public List<Object> getDsSwitch() {
        return dsSwitch;
    }

    @JsonProperty("ds_switch")
    public void setDsSwitch(List<Object> dsSwitch) {
        this.dsSwitch = dsSwitch;
    }

    @JsonProperty("path")
    public List<Path> getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(List<Path> path) {
        this.path = path;
    }

    @JsonProperty("body")
    public List<Body> getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(List<Body> body) {
        this.body = body;
    }

    @JsonProperty("field_ambito")
    public List<FieldAmbito> getFieldAmbito() {
        return fieldAmbito;
    }

    @JsonProperty("field_ambito")
    public void setFieldAmbito(List<FieldAmbito> fieldAmbito) {
        this.fieldAmbito = fieldAmbito;
    }

    @JsonProperty("field_tiempo_de_lectura")
    public List<FieldTiempoDeLectura> getFieldTiempoDeLectura() {
        return fieldTiempoDeLectura;
    }

    @JsonProperty("field_tiempo_de_lectura")
    public void setFieldTiempoDeLectura(List<FieldTiempoDeLectura> fieldTiempoDeLectura) {
        this.fieldTiempoDeLectura = fieldTiempoDeLectura;
    }

}

