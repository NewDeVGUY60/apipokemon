package com.exo.pokemon.DTO;

public class PokemonDTO {
    private Long id;
    private String name;
    private Long typeId;
    private Long infirmiereId;
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the typeId
     */
    public Long getTypeId() {
        return typeId;
    }
    /**
     * @param typeId the typeId to set
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
    /**
     * @return the infirmiereId
     */
    public Long getInfirmiereId() {
        return infirmiereId;
    }
    /**
     * @param infirmiereId the infirmiereId to set
     */
    public void setInfirmiereId(Long infirmiereId) {
        this.infirmiereId = infirmiereId;
    }

    
}
