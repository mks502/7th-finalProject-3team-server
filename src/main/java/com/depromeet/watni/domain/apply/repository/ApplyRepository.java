package com.depromeet.watni.domain.apply.repository;

import com.depromeet.watni.domain.apply.domain.BaseApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyRepository<T extends BaseApply> extends JpaRepository<BaseApply, Long> {

}
