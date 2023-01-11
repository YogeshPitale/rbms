package com.wf.stp.rbms.repository;

import com.wf.stp.rbms.dto.upo.Id;
import com.wf.stp.rbms.dto.upo.Upo;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@JaversSpringDataAuditable
public interface UpoRepository extends MongoRepository<Upo, Id> {

}
